import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a;
		while(sc.hasNextInt()) {
			a=sc.nextInt();
			if(a==4||a==9||a==16||a==25||a==49||a==81) {
				System.out.println("Yes");
			}else {
		for(int i=2;i<10;i++) {
			if(a%i==0) {
				a=a/i;
			}
			if(a==1) {
				System.out.println("Yes");
				break;
			}
			if(i==9&&a/9!=1) {
				System.out.println("No");
		}
		}
		}
		}
	}
}
