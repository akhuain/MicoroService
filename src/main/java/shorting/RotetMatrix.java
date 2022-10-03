package shorting;

import java.util.Arrays;
import java.util.Scanner;

public class RotetMatrix {
    public static void main(String [] arg){
        System.out.println("Enter the matrix value of m : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter the matrix value of n : ");
        int n = sc.nextInt();
        int matrix [][]   ={{1,2,3},{4,5,6},{7,8,9}};
        int arra[]={45,32,12,1,5,2};
        Arrays.sort(arra,0,3);
        System.out.println();

        // tow represent tow D array

        int twoDarry[][]= new int[2][];
        twoDarry[0]=new int[4];
        twoDarry[1]= new int [2];
        for(int k=0;k<twoDarry.length;k++){  // tow Dymentional raay only present base array length.
            for(int l=0;l<twoDarry[k].length;l++){

            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println(" After Rd:  ");

        int[][] matrix2 = new int [3][3];
        for(int k=0;k<matrix.length;k++){
            for (int l=0;l<3;l++){
               matrix2[k][l] = matrix[k][l];
               System.out.print(matrix2[k][l] + " ");
            }
            System.out.println();
        }




    }
}
