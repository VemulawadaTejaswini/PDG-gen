import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String input = sc.next();
		char[] ipt = input.toCharArray();
	//	System.out.println(Arrays.toString(ipt));
		String[] way = {"SS" , "SW" , "WS" , "WW" };
		char[]one = {'S' , 'S' , 'W' , 'W'};
		char[]two = {'S' , 'W' , 'S' , 'W'};
		char[]ans = new char[N+1];
		//String res ="";
		for(int i = 0 ; i<4; i++) {
			ans[0] = one[i];
			ans[1] = two[i];
			ans = getAnswer(ans, ipt);
			if(ans[ans.length-1] == ans[0]) {
				for(int j = 0 ; j<ans.length-1; j++) {
					System.out.print(ans[j]);
				}
				System.out.println();
				return;
			}
		}
		System.out.println(-1);
	}
	
	static char[] getAnswer(char[] ans, char[] ipt) {
	//	System.out.println(Arrays.toString(ipt));
		for(int i = 1; i<ipt.length; i++) {
	//		System.out.println(Arrays.toString(ans));
			if(ipt[i] == 'o') {
				if(ans[i] == 'S') {
					if(ans[i-1] == 'S') {
						ans[i+1]='S';
					}
					else {
						ans[i+1]='W';
					}
				}
				else {
					if(ans[i-1] == 'S') {
						ans[i+1]='W';
					}
					else {
						ans[i+1]='S';
					}
				}
			}
			else {
				if(ans[i] == 'S') {
					if(ans[i-1] == 'S') {
						ans[i+1]='W';
					}
					else {
						ans[i+1]='S';
					}
				}
				else {
					if(ans[i-1] =='S') {
						ans[i+1]='S';
					}
					else {
						ans[i+1]='W';
					}
				}
			}
		}
		return ans;
	}
	
	
	
/*	static boolean judge(char[] ans, String input) {
		if(input.charAt(input.length()-1) == 'o') {
			if(ans[ans.length-1] == 'S') {
				if(ans[ans.length-2] == 'S') {
					if(ans[0] == 'S') {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					if(ans[0] == 'W') {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				if(ans[ans.length-2] == 'S') {
					if(ans[0] == 'S') {
						return false;
					}
					else {
						return true;
					}
				}
				else {
					if(ans[0] == 'W') {
						return false;
					}
					else {
						return true;
					}
				}
			}
		}
		else {
			if(ans[ans.length-1] == 'S') {
				if(ans[ans.length-2] == 'S') {
					if(ans[0] == 'S') {
						return false;
					}
					else {
						return true;
					}
				}
				else {
					if(ans[0] == 'W') {
						return false;
					}
					else {
						return true;
					}
				}
			}
			else {
				if(ans[ans.length-2] == 'S') {
					if(ans[0] == 'S') {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					if(ans[0] == 'W') {
						return true;
					}
					else {
						return false;
					}
				}
			}
		}
	}*/
}
