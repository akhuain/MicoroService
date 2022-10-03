package technicalclass.stringtech;

import java.util.Arrays;
import java.util.*;

public class Spirngtest {
    public static void main (String [] arg){
        String[] words = {"pop","ppo","bat","tab","opp"};
        List<List<String>> res = groupAnagrams(words);
        System.out.println(res);

    }
    public static List<List<String>> groupAnagrams(String[] str){
        List<List<String>> dubleList= new ArrayList<List<String>>();
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(String s1:str){
            char[] s2= s1.toCharArray();
            Arrays.sort(s2);
             String sortedStrin=String.valueOf(s2);

             if(map.get(sortedStrin)!=null){
               List<String> l2=  map.get(sortedStrin);
               l2.add(s1);
               map.put(sortedStrin,l2);
             }
             else {
                 List<String> l1 = new ArrayList<>();
                 l1.add(s1);
                 map.put(sortedStrin, l1);
             }


        }
        for(Map.Entry entset:map.entrySet())
            dubleList.add((List<String>) entset.getValue());

        return dubleList;
    }
}
