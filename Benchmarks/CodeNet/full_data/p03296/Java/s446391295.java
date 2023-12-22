import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int next, count=0;

		for(int i=0; i<n;i++) {
			next=sc.nextInt();
			if(a==next) {
				count++;
				a=0;
			}
			else {
				a=next;
			}
		}

		System.out.print(count);

	}

}
