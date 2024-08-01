//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String transform(String s)
    {
       String t = "";
        String[] str = s.split(" ");
        
        for (int i = 0; i < str.length; i++) {
            String n = str[i];
            int l = n.length();
            if (l > 0) {
                t += Character.toUpperCase(n.charAt(0)) + n.substring(1) + " ";
            }
        }
        
        return t.trim();
    }
}