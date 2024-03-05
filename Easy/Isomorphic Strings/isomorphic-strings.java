//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    { 
        int n = str1.length();
        int m = str2.length();
        if(n != m) return false;
      HashMap<Character,Character> h = new HashMap<>();
      for(int i=0;i<str1.length();i++){
          Character c1 = str1.charAt(i);
          Character c2 = str2.charAt(i);
          if(h.containsKey(c1)){
              if(h.get(c1) != c2) return false;
          }
              else if(h.containsValue(c2)) {
                  return false;
          }    else{
              h.put(c1,c2);
          }
      }
      return true;
    }
}