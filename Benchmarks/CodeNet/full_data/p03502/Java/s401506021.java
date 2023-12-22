import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int a=0;
		int b=0;
		while(true) {
			if(X/(10^a)>0) {
				a=a+1;
			}else {
				break;
			}
		}
		for(int i=a;i<=0;i--) {
			b=b+(X/(10^i));
		}
		if(X%b==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
