import java.util.*;
class Cat {
    int jumpingHeight(int weight){
        System.out.println(10);
        return 10;
    }
}
class WildCat extends Cat{
    int jumpingHeight(int weight){
        System.out.println("20");
        return weight;
    }
// }
// public class MethodOverriding3{
    // public MethodOverriding3() {
    // }

    public static void main(String args[]){
        WildCat wc=new WildCat();
        wc.jumpingHeight(30);
    }
}