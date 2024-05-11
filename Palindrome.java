package ArrayDataStructures;


// the time complexity is O(n/2):O(n)
// the space complexity is O(1)
public class Palindrome 
{
   public static void main(String[] args) 
   {
       
         int arr[]={1,2,3,3,2,1};
         int n = arr.length;
         
    
         int flag=0;
    
         for(int i=0;i<n/2;i++)
            {
                if (arr[i]!=arr[n-i-1]) 
                {
                flag=1;
                System.out.println("the array is  not palindrome");
                break   ;
    
                }
            }
            if (flag==0) 
            {
                System.out.println("the array is the palindome array");    
            }
    
        
    
    }
}
