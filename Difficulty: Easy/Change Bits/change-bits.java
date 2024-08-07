//{ Driver Code Starts
//Initial Template for Java

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
            int[] ans = ob.changeBits(N);
            System.out.println(ans[0]+ " "+ ans[1]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] changeBits(int N) {
        String binaryString = Integer.toBinaryString(N);
        String modifiedBinaryString = binaryString.replace('0', '1');
        int newNumber = Integer.parseInt(modifiedBinaryString, 2);
        int difference = newNumber - N;
        return new int[]{difference, newNumber};
    }
};