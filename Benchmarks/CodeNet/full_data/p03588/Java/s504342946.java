import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int maxa=-1;
		int maxb=0;
		for(int i=0;i<n;i++) {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			if(maxa<a) {
				maxa=a;
				maxb=b;
			}
		}
		System.out.println((long)maxa+maxb);
	}
}
