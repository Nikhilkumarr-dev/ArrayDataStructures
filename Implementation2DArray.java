package ArrayDataStructures;

import java.util.Scanner;

public class Implementation2DArray 
{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
    
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of rows in an array");
        int m = scan.nextInt();
        System.out.println("enter the number of columns in array");
        int n = scan.nextInt();
        // declaration of 2D array
        int[][] arr=new int[m][n];
        for (int i = 0; i <m; i++)
        {
            for (int j = 0; j < n; j++) 
            {
            
                arr[i][j]=10;
            }
        }
    
        // printing all elements in a 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(arr[i][j] + " ");
               
            }
        }

    }
}
