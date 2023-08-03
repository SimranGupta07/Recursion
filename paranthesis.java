package Recursion;

public class paranthesis {

	public static List<String> main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
List<String> ll=new ArrayList<>();
paranthesis(n,"",0,0,ll);
System.out.print(ll);
return ll;
	}
	public static void paranthesis(int n,String ans,int open,int close,List<String>ll) {
		if(close==n&&open==n) {
			//System.out.println(ans);
			ll.add(ans);
			return;
		}
		if(open<n) {
			paranthesis(n,ans+"(",open+1,close,ll);
		}
		if(close<open)
		{
			paranthesis(n,ans+")",open,close+1,ll);
		}
	}

}
