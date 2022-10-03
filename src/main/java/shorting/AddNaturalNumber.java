package shorting;

import java.util.*;

public class AddNaturalNumber {
    public static void main(String arg[]) {
        test();
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Value of all natual number is + " + sum(x));
        Boolean b = returnStringsynonimus();
        System.out.println("Given String is Synonymus  + " + b);
        
        



    }

    public static boolean returnStringsynonimus() {
        List<List<String>> list1 = new ArrayList<>();
        Map<String,String> map = new HashMap<String,String>();
        list1 = Arrays.asList(Arrays.asList("hello", "hi"), Arrays.asList("good", "fine"));
        List<List<String>> li2 = new ArrayList<>();
        ListIterator<List<String>> l1 = list1.listIterator();

        List<String> str1 = new ArrayList<>();

            while (l1.hasNext()) {
                str1 = l1.next();
                map.put(str1.get(0), str1.get(1));
            }


        li2 = List.of(List.of("hello injdia no good"), List.of("hi india no fine"));
            List<String> ls3 = li2.get(0);
            String[] s =ls3.get(0).split(" ");
            List<String> ls4 = li2.get(1);
            String[] s2 = ls4.get(0).split(" ");
            for (int i=0;i<s2.length;i++) {
                if (s2[i].equals(s[i])) {
                    continue;
                }
          else if(map.containsKey(s[i])) {
                        String s3 = map.get(s[i]);
                       if(!s3.equals(s2[i])){
                            return false;
                        }
                    }
          else if(!map.containsKey(s[i]))
                    return false;


            }
        return true;
    }

  public static int sum(int s){
        if(s==0){
            return 0;
        }
        else{
            System.out.println(s);
           return sum(s-1)+s;
        }
    }

    public static void test(){
        List<List<List<String>>> threeDList = new ArrayList<List<List<String>>>();
        Map<Map<String,String>,Map<String,String>> twoDMap = new HashMap<Map<String,String>,Map<String,String>>();
        twoDMap.put(Map.of("Delhi","roadno5","Hyderabad","Colony5"),Map.of("Askfak","ahmed","Ram","Kumar"));

        for(Map.Entry entry : twoDMap.entrySet()){
            Map<String,String> map1 = (Map<String,String>)entry.getValue();
           for (Map.Entry me : map1.entrySet()){
            System.out.println("map 2 Day value is "+ me.getValue());
           }
            Map<String,String> map2 = (Map<String,String>) entry.getKey();
       for( Map.Entry ep : map2.entrySet()){
           System.out.println("map 2 Day key is "+ ep.getKey());
       }
        }

        threeDList=  Arrays.asList(Arrays.asList(Arrays.asList("hello")));
        Map<String,List<String>> map = new  HashMap<String,List<String>>();
        map.put("delhi",List.of("roadno 5","road no6"));
       map= Map.of("hyd",List.of("FriendsColony"),"varansi",List.of("Dubi","india"));
      Collection<List<String>> vaue= map.values();
    for (List<String> ls : vaue) {
        System.out.println(ls);
       boolean bl= ls.contains("india");
       map.equals()get()
    }

        Collection<List<String>> values = map.values();
        Iterator it = values.iterator();
        while (it.hasNext()){
           List<String> ls = (List<String>)it.next();
            boolean india = ls.contains("india");
            System.out.println("this value is " + india);
        }
        for (Map.Entry ent : map.entrySet()) {
            System.out.println("Map key is " + ent.getKey());
            System.out.println("respactive Map Value is " + ent.getValue());
            
        }
        
    
        Set<List<String>> set = new HashSet<List<String>>();
        set.add(List.of("hello","Dubai"));
        set = Set.of(List.of("heeo","hi"),List.of("india","dubak"));
      set.forEach(System.out::println);


    }
}
