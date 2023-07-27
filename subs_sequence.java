package Recursion;

public class subs_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc";
seq(str,"");

	}
	public static void seq(String ques,String ans) {
		if(ques.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		char ch=ques.charAt(0);
		seq(ques.substring(1),ans);
		seq(ques.substring(1),ans+ch);
	}

}
