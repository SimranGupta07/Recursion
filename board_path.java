package Recursion;

public class board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
board_path(n,0,"");
	
	}
	public static void board_path(int n,int curr,String ans) {
		if(curr==n) {
			System.out.println(ans);
			return;
		}
		if(curr>n) {
			return;
		}
		board_path(n,curr+1,ans+1);
		board_path(n,curr+2,ans+2);
		board_path(n,curr+3,ans+3);
	}

}
