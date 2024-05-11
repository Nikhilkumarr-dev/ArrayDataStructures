package ArrayDataStructures;

import java.util.Scanner;
class PrefixSumRectangle2D
{
    
    public static int findSumMatrix(int[][] arr,int r1,int c1,int r2, int c2 )
    {
         int sum = 0;
        for (int i = r1; i <=r2; i++) 
        {
         for (int j = c1; j <=c2; j++) 
         {
            sum =sum+arr[i][j];
        }   
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of rows");
        int m=scan.nextInt();
        System.out.println("enter number of columns");
        int n = scan.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("enter the matrix elements");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                arr[i][j]=scan.nextInt();        
            }
            

        }
        int r1,c1,r2,c2;
        System.out.println("enter the value of r1 coordinate");
        r1=scan.nextInt();
        System.out.println("enter the value of c1 coordinate");
        c1=scan.nextInt();
        System.out.println("enter the value of r2 coordinate");
        r2=scan.nextInt();
        System.out.println("enter the value of c2 coordinate");
        c2=scan.nextInt();
        int result=findSumMatrix(arr, r1, c1, r2, c2);
        System.out.println("the sum of given rectangle matrix will be" + result);

    }
}
 