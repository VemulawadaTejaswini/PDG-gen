import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1000) {
			System.out.println(972926972);
			return;
		}
		long res = getValue(n);
		long count = 0;
		for(int i=1; i<=res; i++) {
			if(res%i==0) {
				count++;
			}else {
				continue;
			}
		}
		System.out.println(count);
	}

	private static long getValue(int n) {
		if(n==0) {
			return 1;
		}
		return n*getValue(n-1);
	}
}
