//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
     public void permute(String ip , String op , List<String> result)
    {
        if( ip.length() == 0 )
        {
            result.add(op);
            return;
        }
        
        Set<Character> set = new HashSet<>();
        for( int i = 0 ; i < ip.length() ; i++ )
        {
            if( !set.contains( ip.charAt(i)) )
            {
                set.add( ip.charAt(i) );
                String newip = ip.substring(0,i) + ip.substring(i+1);
                String newop = op + ip.charAt(i);
                permute( newip , newop , result );
            }
        }
    }
    
    public List<String> find_permutation(String S) {
         
        List<String> res = new ArrayList<>();
        permute( S , "" , res );
        Collections.sort(res);  
        return res;
    }
}