import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int len = S.length() - 1;
		String buf = S.substring(0,(len / 2));
		String buf2 = S.substring(((len + 2) / 2),len + 1);
		String ans = "No";
		if(checkRet(S) && checkRet(buf) && checkRet(buf2)){
			ans = "Yes";
		}
		System.out.println(ans);
	}
	public static boolean checkRet(String s){
		int n;
		int len = s.length() - 1;
		if(len > 1){
			n = len / 2;
		}else{
			n = 1;
		}
		for(int i = 0;i < n;i++){
			if(s.charAt(i) != s.charAt(len - i)){
				return false;
			}
		}
		return true;
	}
}