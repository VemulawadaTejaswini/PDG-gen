import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a;
		while(sc.hasNextInt()) {
			a=sc.nextInt();
		for(int i=2;i<10;i++) {
			if(a%i==0) {
				a=a/i;
			}
			if(a==1) {
				System.out.println("Yes");
				break;
			}
		}
		if(a!=1) {
			System.out.println("NO");
		}
		}
		
	}
}
