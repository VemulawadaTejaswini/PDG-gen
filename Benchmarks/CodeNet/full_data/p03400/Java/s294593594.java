import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),d=sc.nextInt(),x=sc.nextInt();
		int choco = 0;
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			choco++;
			for(int j=1; j<=d; j++) {
				if(a*j+1 <= d) choco++;
			}
		}
		System.out.println(choco+x);
	}
}
