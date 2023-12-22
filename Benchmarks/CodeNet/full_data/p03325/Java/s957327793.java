import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			int op=0;
			for(int i=0; i<n; i++) {
				int a=sc.nextInt();
				int count=0;
				while(a>0) {
					if(a%2==1) {
						break;
					}
					a=a/2;
					count++;
				}
				op+=count;
			}

			System.out.println(op);
		}
	}
}