import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),buff;
		for(int i=0;i<n;i++) {
			buff=sc.nextInt();
			if(buff%2==0) {
				if(buff%3==0 || buff%5==0) {
				}else {
					System.out.println("DENIED");
					System.exit(0);
				}
			}
		}
		System.out.println("APPROVED");

	}
}

