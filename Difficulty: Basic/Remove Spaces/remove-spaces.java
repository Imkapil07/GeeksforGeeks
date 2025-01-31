//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s;
            s = br.readLine();

            Solution ob = new Solution();

            System.out.println(ob.modify(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {

    String modify(String s) {
        s = s.replaceAll("\\s","");
        return s;
    }
}