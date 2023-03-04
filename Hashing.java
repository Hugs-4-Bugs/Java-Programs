import java.util.*;
// import java.util.Iterator;
public class Hashing {
    public static void main(String args[]){
        // cresting the HashSet
        HashSet<Integer> set = new HashSet<>();
        //Same as ==> ArrayList<Integer> list=new ArrayList<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // // size 
        // System.out.println("size of set is :" + set.size());

        // iterator 

        Iterator it = set.iterator();  // (it=iterator and it's type is Iterator)
        // two functions are used 1. next, 2. hasNext
        while(it.hasNext()){
            System.out.println(it.next());
        }


        // search - contains

        // if(set.contains(1)){
        //     System.out.println("set contains 1");
        // }
        // if(!set.contains(6)){
        //     System.out.println("set doesn't contains 6 ");
        // }


        // //  // Delete
        //  set.remove(1);
        //  if(!set.contains(1)){
        //     System.out.println("does not contains 1");
        //  }

        // System.out.println(set);
        

        
    }
}
