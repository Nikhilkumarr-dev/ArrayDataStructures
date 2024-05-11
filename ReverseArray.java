package ArrayDataStructures;

// time complexity is O(n)
// Space complexity is O(1)
public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};

        int n=5;
        for (int i = 0; i < n/2; i++) 
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        
        }
        System.out.println("Reverse array is");
        for (int i = 0; i < n; i++)
        {
         System.out.print(arr[i] + " ");   
        }
    }
}

