//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean ans = ob.isDigitSumPalindrome(N);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        
        return pal(sum);
    }
    
    boolean pal(int n){
        int t = n;
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if(t == rev) return true;
        
        return false;
    }
    
}