package ArrayDataStructures;

public class DuplicateElements 
{
    public static void main(String[] args) {
    int arr[]={1,2,2,3,7};
    int n=arr.length;
    for (int i = 0; i < arr.length; i++) 
    {
        for (int j = i+1; j < n; j++) {
            if (arr[i]==arr[j])
            {
                System.out.print( "the duplicate number is: " + arr[i]);    
            } 
        }
        
    }
    }
}
