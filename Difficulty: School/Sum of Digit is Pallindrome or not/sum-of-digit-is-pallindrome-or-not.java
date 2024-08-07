//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int n) {
        int sum  = 0;
        int temp = n;
        while(temp != 0){
            sum += (temp % 10);
            temp /= 10;
        }
        int temp2 = sum;
        int rev = 0;
        while(temp2 !=0){
            rev = rev * 10 + (temp2%10);
            temp2 /= 10;
        }
        
        if(sum == rev) return 1;
        
        return 0;
    }
}