//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends

class Solution
{
    
    static boolean ispar(String x)
    {
        Stack<Character> s = new Stack<>();
        
        for (char c : x.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else if (c == ')' && !s.isEmpty() && s.peek() == '(') {
                s.pop();
            } else if (c == '}' && !s.isEmpty() && s.peek() == '{') {
                s.pop();
            } else if (c == ']' && !s.isEmpty() && s.peek() == '[') {
                s.pop();
            } else {
                return false;
            }
        }
        
        return s.isEmpty();
    }
}
