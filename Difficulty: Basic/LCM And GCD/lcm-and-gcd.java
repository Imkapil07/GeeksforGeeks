//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int ans[] = new int[2];
        int g = gcd(a,b);
        return new int[]{lcm(a,b,g),g};
    }
    
    static int lcm(int a,int b,int g){
        return (a*b)/g;
    }
    
    static int gcd(int a,int b){
        
        for(int i = Math.min(a,b); i>0;i--){
            if(a%i==0 && b%i==0) return i;
        }
        
        return 1;
    }
}

//{ Driver Code Starts.

// } Driver Code Ends