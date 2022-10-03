package singltoneexp;

import java.util.Scanner;

public class ReverseStrng {
    public  static  StringBuffer reverse(){
        System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
      char[] ch3=  str.toCharArray();
      int chasize=ch3.length;
      int initialIndex=0;
      while (chasize>initialIndex){
          if(chasize++ != initialIndex++) {
              System.out.println("this is not Paindrom");

          }
          else {
              System.out.println("this is  Palindrom");

          }
      }


        String[] strarray =str.split("\\.");
      StringBuffer sb1 = new StringBuffer();
       for (int i=strarray.length-1;i>=0;i--){
           String s = strarray[i];
         char[] ch2=  s.toCharArray();
         StringBuffer sb= new StringBuffer();
         for (int j=ch2.length-1;j>=0;j--){
            sb.append(ch2[j]);
         }
         System.out.println("===============" + s);

           if(i!=0){
               sb1.append(".");
           }
       }
       System.out.println("====================  "+sb1);
        StringBuffer sb = new StringBuffer();
        char [] charString = str.toCharArray();
        for(int i=charString.length-1; i>=0;i--){
            sb.append(charString[i]);
        }
       return sb;
    }
}
