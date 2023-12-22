import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String ans = s.substring(0,k);
		k--;
		if(s.substring(k,k+1).equals("A")){
			ans = ans+"a";
		}else if(s.substring(k,k+1).equals("B")){
			ans = ans+"b";
		}else{
			ans = ans+"c";
		}
		ans = ans+s.substring(k+1,s.length());
		System.out.print(ans);
	}
}
