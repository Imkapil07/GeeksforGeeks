//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        int r[]=new int[n+m];
        for(int i=0;i<n;i++){
            r[i]=a[i];
        }
        for(int i=n;i<n+m;i++){
            r[i]=b[i-n];
        }
        Arrays.sort(r);
       
        int h=n+m;
        double mid;
        if(h%2==0){
            mid=(double)(r[(h/2)-1]+r[h/2])/2;
        }
        else{
            mid=r[h/2];
        }
        return mid;
    }
}