//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}
// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
        if(s.isEmpty())return Integer.MAX_VALUE;
          int num=s.pop();
          int ans= min(s);
          return Math.min(ans,num);
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           return (s.size() == n);
	}
	public boolean isEmpty(Stack<Integer>s)
        {
          return (s.size() == 0); 
	}
}