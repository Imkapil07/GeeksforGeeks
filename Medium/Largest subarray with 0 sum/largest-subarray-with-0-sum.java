//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
       int maxL = 0;
       int preSum = 0;
       
       HashMap<Integer,Integer> hp = new HashMap<>();
       hp.put(0,-1);
       for(int i=0;i<n;i++){
           preSum+=arr[i];
           if(hp.containsKey(preSum)){
               maxL = Math.max(maxL,i-hp.get(preSum));
           }else{
               hp.put(preSum,i);
           }
       }
       return maxL;
    }
}