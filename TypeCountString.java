public class TypeCountString {
    public static void countTypeInString(String string){
        String[] value = string.split(" ");
        double ifDouble;
        int ifInt;
        String ifString;
        int counter = 0;
        // count Double
        for (String i: value){
            try{
                ifDouble = Double.parseDouble(i);
                // counter++;
                continue;
            } catch (NumberFormatException e){
            }
        }
        System.out.println("Double " + counter);

        //count ints
        counter = 0;
        for (String i: value){
            try{
                ifInt = Integer.parseInt(i);
                counter++;
                continue;
            } catch (NumberFormatException e){
            }

        }
        System.out.println("Int " + counter);

        //counts strings
        String stringOfStrings = string.replaceAll("[0-9.]","");
        stringOfStrings = stringOfStrings.replaceAll("  "," ");
        String[] value2 = stringOfStrings.split(" ");
        System.out.println("String " + value2.length);


    }

    public static void main(String[] args) {
        String string = "give me 10 dollars";
        System.out.println(string);
        countTypeInString(string);
    }
}