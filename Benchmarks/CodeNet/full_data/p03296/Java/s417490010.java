import java.util.Scanner;

public class Main {
	public static int N = 0;
	public static int magic = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int a[] = new int[N];
		
		for(int i = 0;i < N;i++) {
			a[i] = scan.nextInt();
		}
	
		int i = 0;
		while(i < N - 1) {
			int count = 1;
			while(a[i] == a[i+1]) {
				count++;
				System.out.println(a[i]);
				i++;
			}
			i++;
			magic += count / 2;
		}
		
		scan.close();
		System.out.println(magic);
	}
}
