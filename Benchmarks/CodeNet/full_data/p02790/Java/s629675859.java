import java.util.Scanner;

public class Main {
	static String rep(int a , int b){
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < b; ++i){
			sb.append(a);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s1 = rep(a, b);
		String s2 = rep(b ,a);
		if(a < b){
			System.out.println(s1);
		}else{
			System.out.println(s2);			
		}
	}
}
