import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String input = sc.next();
		String[] way = {"SS" , "SW" , "WS" , "WW" };
		String res ="";
		for(int i = 0 ; i<4; i++) {
			res = way[i];
			res = getAnswer(res, input);
			boolean OK = judge(res,input);
			if(OK) {
				System.out.println(res);
				return;
			}
		}
		System.out.println(-1);
	}
	static String getAnswer(String res, String input) {
		for(int i = 1; i<input.length()-1; i++) {
			if(input.charAt(i) == 'o') {
				if(res.charAt(res.length()-1) == 'S') {
					if(res.charAt(res.length()-2) == 'S') {
						res+="S";
					}
					else {
						res+="W";
					}
				}
				else {
					if(res.charAt(res.length()-2) == 'S') {
						res+="W";
					}
					else {
						res+="S";
					}
				}
			}
			else {
				if(res.charAt(res.length()-1) == 'S') {
					if(res.charAt(res.length()-2) == 'S') {
						res+="W";
					}
					else {
						res+="S";
					}
				}
				else {
					if(res.charAt(res.length()-2) =='S') {
						res+="S";
					}
					else {
						res+="W";
					}
				}
			}
		}
		return res;
	}
	static boolean judge(String res, String input) {
		if(input.charAt(input.length()-1) == 'o') {
			if(res.charAt(res.length()-1) == 'S') {
				if(res.charAt(res.length()-2) == 'S') {
					if(res.charAt(0) == 'S') {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					if(res.charAt(0) == 'W') {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				if(res.charAt(res.length()-2) == 'S') {
					if(res.charAt(0) == 'S') {
						return false;
					}
					else {
						return true;
					}
				}
				else {
					if(res.charAt(0) == 'W') {
						return false;
					}
					else {
						return true;
					}
				}
			}
		}
		else {
			if(res.charAt(res.length()-1) == 'S') {
				if(res.charAt(res.length()-2) == 'S') {
					if(res.charAt(0) == 'S') {
						return false;
					}
					else {
						return true;
					}
				}
				else {
					if(res.charAt(0) == 'W') {
						return false;
					}
					else {
						return true;
					}
				}
			}
			else {
				if(res.charAt(res.length()-2) == 'S') {
					if(res.charAt(0) == 'S') {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					if(res.charAt(0) == 'W') {
						return true;
					}
					else {
						return false;
					}
				}
			}
		}
	}
}
