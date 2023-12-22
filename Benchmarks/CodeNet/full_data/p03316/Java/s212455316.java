import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int s=0;
		String ns=n+"";
		for(int i=0; i<ns.length(); i++) {
			s+=ns.charAt(i)-'0';
		}
		System.out.println((n%s==0?"Yes":"No"));
	}
}