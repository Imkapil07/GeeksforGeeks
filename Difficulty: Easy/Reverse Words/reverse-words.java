//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
       String c = "";
       String[] str = S.split("\\.");
       int n = str.length;
    //   for(int i=n-1;i>=0;i--){
    //       sb.append(str[i]);
    //       if(i!=0) sb.append(".");
    //   }
        
        int i = 0 , j = n-1;
        
        while(i<j){
            String t = str[i];
            str[i] = str[j];
            str[j] = t;
            i++;
            j--;
        }
        
         for(int ii=0;ii<n;ii++){
             c+=str[ii];
             if(ii!=n-1) c+=".";
         }
    
       return c;
    }
}