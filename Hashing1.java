import java.util.*;

public class Hashing1 {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        // // insertion 
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        // System.out.println(map);

        // map.put("China", 180);
        // System.out.println(map);
         
        // // search/lookup operation
        // if(map.containsKey("China")){
        //     System.out.println("key is present in the map");
        // } else {
        //     System.out.println("key is not present in the map");

            // System.out.println(map.get("China")); // key exists
            // System.out.println(map.get("Indonesia"));  // key doesn't exist
        // }

    //     int arr[] = {12, 15, 18};
    //     for(int i=0; i<3; i++) {
    //         System.out.print(arr[i]+" ");  // type 1
    //     }
    //     System.out.println();
    //     for(int val : arr) {
    //         System.out.print(val + " ");  // type 2
    // } 
    // System.out.println();
    for( Map.Entry<String, Integer> e: map.entrySet()) {
        System.out.println(e.getKey());
        System.out.println(e.getValue());
        }
}
    
}
