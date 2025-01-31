//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            long n = inputLine.length;
            long arr[] = new long[(int)(n)];

            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution obj = new Solution();
            long answer[] = obj.findElements(arr);
            long sz = answer.length;

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < sz; i++) output.append(answer[i] + " ");
            System.out.println(output);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long[] findElements(long arr[]) {
     int n = arr.length;
         Arrays.sort(arr);
 
       long[] a = new long[n-2];
    for (int i = 0; i < n - 2; i++)
      a[i] = arr[i];
      
      return a;
    }
}