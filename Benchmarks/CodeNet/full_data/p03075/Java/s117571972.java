import java.util.*;

public class Main{
	public static void main(String[] args){
		// 標準入力
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		
		String s = "";

		if(b - a > k){
			s = ":(";
		}else if(c - b > k){
			s = ":(";
		}else if(d -c > k){
			s = ":(";
		}else if(e - d > k){
			s = ":(";
		}else{
			s = "Yay!";
		}

		System.out.println(s);
		sc.close();
	}
}
