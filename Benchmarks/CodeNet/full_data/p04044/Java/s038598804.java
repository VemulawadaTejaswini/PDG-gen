import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int N = sc.nextInt();
		String s[] = new String[N];
		for(int i = 0; i < N; i++){
			s[i] = sc.next();
		}
		Arrays.sort(s);
		for(int i = 0; i < N; i++){
			System.out.print(s[i]);
		}
		System.out.println("");
	}
}