package Recursion;

public class coin_toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		cointoss(n,"");
			}
			public static void cointoss(int n,String ans) {
				if(n==0) {
					System.out.print(ans+" ");
					return;
				}
				if(ans.length()==0||ans.charAt(ans.length()-1)!='h') {
				cointoss(n-1,ans+"h");
				}
				cointoss(n-1,ans+"t");
			}

		}

