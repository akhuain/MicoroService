package technicalclass.stringtech;

import java.util.*;
import java.util.stream.Stream;

public class AnagramString {
    public static void main(String[] arg) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        System.out.println("Gven String of Array is +++++++++++++++++++++++++");
        String[] anagraString = {"aet", "tae", "ate", "abg"};
        Arrays.stream(anagraString).sorted();

        Stream<String> sorted = Arrays.stream(anagraString).sorted();
       // sorted.forEach(System.out::println);
 List<String> li = new ArrayList<>();
 List<String> li2= new ArrayList<>();
        for (String s : anagraString) {
            char[] shortstring = s.toCharArray();
            Arrays.sort(shortstring);

          String newShortedStrinf= String.valueOf(shortstring);
         li.add(newShortedStrinf);

        }


    }
}
