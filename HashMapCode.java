import java.util.*;
public class HashMapCode{
    static class HashMap<K,V> { // generics (created by user not by java implementation)
        private class Node { 
            K key;
            V value;

            // constructor
            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n; // n = nodes
        private int N; // N = buckets
        private LinkedList<Node> buckets[]; // N = buckets.length
        
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N=4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode(); // this f'n will give the integer value by changing the form of key
            return Math.abs(bi)%N; // Math.abs f'n is used to make -ve value to +ve (i.e. modulus)

        }
        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
             
            for(int i=0; i<ll.size(); i++){
                if((boolean) (ll.get(i).key = key)){  // 👈
                    return i; // di
                }
            }
            return -1;
        
        }

        // rehashing 
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i=0; i<oldBucket.length; i++){
                LinkedList<Node> ll =  oldBucket[i];
                for( int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        // creating hashFunction method
         private int hashFunction(K key, int bi) {
            return 0;
        }

          // Implementing put function

        public void put(K key, V value){
            int bi = hashFunction(key);  // bi = bucket index
            int di = hashFunction(key,bi); // di= -1  (di = dats index)

            if(di == -1) {  // key doesn't exist
            buckets[bi].add(new Node(key,value));
            n++;

            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda=(double)n/N;
            if(lambda == 2.0){
                rehash();
            }
        }
        // implementing containskey function

       
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di = -1
            if(di == -1){ // key doesn't exist
            return false;

            } else {  // key exist
                return true;
            }
        }
        // Implementing remove function

        public V remove(K key){
            int bi = hashFunction(key);  // bi = bucket index
            int di = hashFunction(key,bi); // di= -1  (di = dats index)

            if(di == -1) {  // key doesn't exist
            return null;
            } else {
                
                Node node = buckets[bi].remove(di);
                n--;
               return node.value;
            }
        }
        // implementing the get function 
        public V get(K key){
            int bi = hashFunction(key);  // bi = bucket index
            int di = hashFunction(key,bi); // di= -1  (di = dats index)

            if(di == -1) {  // key doesn't exist
            return null;
            } else {
                
                Node node = buckets[bi].get(di);
               return node.value;
            }
        }
        // Implementing the keySet function by creating an Array
        //keySet f'n is used to return a set view of the keys contained in this map.

        public ArrayList<K> keySet(){  
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for( int j=0; j<ll.size(); i++){
                    Node node  = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n == 0;
        }
    }
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US",100);
        map.put("Canada", 50);

        ArrayList<String> keys = map.keySet();
        for(int i =0; i<keys.size(); i++){
            System.out.println(keys.get(i)+ " " + map.get(keys.get(i)));
        }
        
        map.remove("India");
        System.out.println((map.get("India")));

    }
}

