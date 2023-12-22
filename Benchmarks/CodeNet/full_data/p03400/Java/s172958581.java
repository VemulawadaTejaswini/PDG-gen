import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),d=sc.nextInt(),x=sc.nextInt();
		int chocolate=0;
		for(int i=0; i<n; i++) {
			int interval=sc.nextInt();
			for(int j=1; j<=d; j+=interval) {
				chocolate++;
			}
		}
		System.out.println(chocolate+x);
	}
}