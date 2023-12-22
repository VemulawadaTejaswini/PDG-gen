import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int answer=1;
		int num=1;
		int finNum=(int)Math.sqrt(X);
		for(int b =2 ; b <= 100 && b<=finNum ; b++) {//100^2まで
			for(int p=2; num<=X ;p++) {
				num=bekijyo(b,p);
				if(num>X) {
					num=bekijyo(b,p-1);
					break;
				}
			}
			answer=Math.max(num, answer);
		}
		System.out.println(answer);
	}
	public static int bekijyo(int b , int p) {
		if(p==0)return 0;
		int ret=b;
		for(int a=1 ; a<p ; a++) {
			ret=ret*b;
		}
		return(ret);
	}
}