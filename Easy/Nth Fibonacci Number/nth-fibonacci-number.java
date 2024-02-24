//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
          if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int prev=0,ans=1,i=2;
        while(i<=n){
            int prev2=(ans)%1000000007;
            ans=(prev2+prev)%1000000007;
            prev=(prev2)%1000000007;
            i++;
        }
        return ans;
    }
}