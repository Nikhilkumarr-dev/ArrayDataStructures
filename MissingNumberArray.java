package ArrayDataStructures;
// time complexity is:O(n)
public class MissingNumberArray {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,8};
        int n=arr.length;
        int sum=0;
        int sum_natural_numbers=((n+1)*(n+2))/2;
        for (int i = 0; i < arr.length; i++) 
        {
            sum+=arr[i];

        }
        int missing_number=sum_natural_numbers-sum;
        System.out.println("the missing num is " + missing_number);
        

    


    }
}
