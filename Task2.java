package lambda;
import java.util.*;
public class Task2 {

    private static List<String> topRankedNames = Arrays.asList(
            "Amelia",
            "Olivia",
            "emily",
            "Isla",
            "Ava",
            "oliver",
            "Jack",
            "Charlie",
            "harry",
            "Jacob"
    );


    public static List<String> getNames() {
        return topRankedNames;
    }


    public static void main(String args[]) {
        try {
            List<String> names = getNames();


            names.stream()
                    // capitalize first letter (at index 0 of string) and set rest of string lowercase
                    // substring(int beginIndex, int endIndex)
                  .map(s-> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() )
                  .sorted()
                  .forEach(System.out::println);




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   /*public static void main(String args[]) {
        try {
            List<String> names = getNames();
           // String[] cap ;//= new String (names,) ;
            //cap = names.toArray();
           /* for( String s : names){
            (	s -> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase());
            }*/



            /*names.forEach((s) -> {s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase()});
            //names.forEach(System.out.println(s-> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase()));
            Collections.sort(names);
            names.forEach(System.out::println);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}


