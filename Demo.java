
import java.util.ArrayList;
import java.util.List;

public class Demo {
public static void main(String args[]) {
List<String> obj = new ArrayList<>();
obj.add("A");
obj.add("B");
obj.add("C");
obj.add(1, "D");
System.out.println(obj);
}
}