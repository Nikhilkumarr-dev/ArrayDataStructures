package ArrayDataStructures;

import java.util.Scanner;

public class PrefixSumOptimizedApproach {
     
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
    // prerfix sum takes o(m*n) time complexity space is constant
     // time complexity : O(m * n)
    // space complexity : O(1)

    

        public static void prefixSum(int arr[][])
    {
        int m=arr.length;
        int n=arr[0].length;
        // travveresig aloong the row wise calculating the prefix sum
         // traversed the array row-wise to calculate the row-wise prefix sum
        for (int i = 0; i <m; i++) 
        {
         for (int j = 1; j < n; j++) 
         {
            
            arr[i][j] += arr[i][j-1];
         }    
        }
        // traversing array along column wise column wise prefix sum
            // traversed the array column-wise to calculate the column-wise prefix sum
        // final 2D Matrix

        for (int j = 0; j < n; j++) 
        {
            for (int i = 1; i < m; i++) 
            {
                arr[i][j] += arr[i-1][j];    
            }
            
        }
        // sumregion takes constant time complexity of O(1)
        
    }
     // time complexity : O(1)
    // space complexity : O(1)
    public static int sumRegion(int[][] arr, int r1, int c1, int r2, int c2) 
    {
        int result=0; 
        int sum=0,left=0,up=0,repeatedRegion=0; 
        sum=arr[r2][c2]; 
        up=arr[r1-1][c2]; 
        left=arr[r2][c1-1]; 
        repeatedRegion=arr[r1-1][c1-1]; 
        result=sum-up-left+repeatedRegion; 
        return result;
       
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
       

        prefixSum(arr);
        int result=sumRegion(arr,r1,c1,r2,c2);
        System.out.println("the result is" + result);

    }
    
}
