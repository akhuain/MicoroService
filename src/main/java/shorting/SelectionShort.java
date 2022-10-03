package shorting;

public class SelectionShort {
    public static void main(String [] arg){
        System.out.println("this is selection short");
        int arry[]={12,23,4,2};
        int min=arry[0];
        int loc=0;
      for(int j=0;j<arry.length-1;j++){
          int locat=loc(arry,arry[j],loc);
          int tem=arry[j];
          arry[j]=arry[locat];

      }

    }

    public static int loc(int arry2[],int m,int lo){

        for(int i=0;i<arry2.length-1;i++){
            if (arry2[i]<m){
                m=arry2[i];
                lo=arry2[i];
            }

        }
        return lo;

    }
}
