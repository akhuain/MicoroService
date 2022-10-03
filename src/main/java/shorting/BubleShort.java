package shorting;

public class BubleShort {
    public static void main (String [] arg){
        Bear b=Bear.JAN;
        Bear[] e= Bear.values();
for (Bear e1:e){
    System.out.println("Value ==" +e1+ "  " + e1.ordinal());
}
        int [] array = {1,6,4,7};
        secountlargevalue(array);
        int siz=array.length;
        System.out.println("size of array is :" + siz) ;
        for(int j=0; j<siz-1;j++){
            int flag=0;
        for (int i=0; i<siz-1;i++){
            if(array[i]>array[i+1]){
                flag=1;
                int temp =array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }
            if(flag==0){
                System.out.println("this is bubleshort:  b");
                for(int x: array){
                    System.out.println(x);
                }
                return;
            }
        }

        System.out.println("this is bubleshort:  b");
        for(int x: array){
            System.out.println(x);
        }
    }
    // secount heighest number is the array
    public static void secountlargevalue( int[] array1){
        int max=0;
        int second=0;
        int third=0;
        int min=array1[0];
        for (int i:array1){

            if(i>max){
                third=second;
                second=max;
                max=i;

            } else if (i>second) {
               third= second;
                second=i;
            } else if (i>third) {
                third=i;

            }
            if(i<=min){
                min=i;
            }

        }
        System.out.println("max element in the array is " + max);
        System.out.println("second max element in the array is " + second);
        System.out.println("third max element in the array is " + third);
        System.out.println("minimum element in the array is " + min);


    }

}
