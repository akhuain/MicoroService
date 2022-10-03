package shorting;

import java.io.*;
import java.util.Scanner;

public class fabonicsericese implements Serializable {
    public static void main (String [] arg) throws IOException, ClassNotFoundException {
        int first=0;
        int secound=1;
        String serialization ="this is the note book";
        String se = new String("this is emutable ");

        se= se.concat("hello india");
        System.out.println(se);
        System.out.println(serialization);

        FileOutputStream fou = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fou);
        oos.writeObject(serialization+" after added");

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
       String s = (String) ois.readObject();
       System.out.println("=======================Input strea data "+ s);


        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
         int number= sc.nextInt();
         if(number==0){
             System.out.println(first);
         }
         else if(number==1){
             System.out.println(first);
         }
         else {
             System.out.print(first + " , "+secound +" ,");
             int x=0;
             int sum=0;
             for(int i=2;i<number;i++){
                 x=secound;
                 secound= first+secound;
                 first=x;
                 System.out.print(secound + ", ");
             }
         }
    }
}
