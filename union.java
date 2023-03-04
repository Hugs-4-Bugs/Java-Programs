import java.util.HashSet;
public class union {
    public static int union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++){
            set.add(arr2[j]);            
        }
        System.out.println(set.toString()+ " "); // this line will print the elements of the union
        return set.size();
    }
    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        System.out.println(union(arr1, arr2));
    }
}


// CODE TO PRINT THE ELEMENTS OF THE UNION IN SET

// import java.util.*;

// class union {
// 	static void Union(int a[], int n, int b[], int m){
//         HashSet<Integer> set = new HashSet<>();
//         for (int i = 0; i < n; i++)
// 			set.add(a[i]);

// 		for (int i = 0; i < m; i++)
// 			set.add(b[i]);
//             System.out.println(set.toString()+ " ");
//     }
//     public static void main(String[] args)
// 	{
// 		int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
// 		int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };

// 		Union(a, 9, b, 10);
// 	}
// }
 
