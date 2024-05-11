package ArrayDataStructures;

public class PrefixSum1
{
    public static void main(String[] args) {
        int arr[][]=
        {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
        };
        int sum =0;
    
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                sum +=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}