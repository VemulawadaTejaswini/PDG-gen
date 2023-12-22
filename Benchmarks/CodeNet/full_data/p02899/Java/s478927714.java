import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for(int i=0;i<N;i++) {
			int a = sc.nextInt();
			int num = i+1;
			A[a-1] = num;
		}
		
		StringBuilder s = new StringBuilder();
		for(int a:A) {
			s.append(a);
			s.append(" ");
		}
		System.out.println(s.toString().trim());
		
		sc.close();	
	}
}