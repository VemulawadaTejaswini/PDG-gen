import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String ans = sc.next();
		for (int i = 1; i < N; i++) {
			ans = i % 2 == 1 ? sc.next() + " " + ans : ans + " " + sc.next();
		}
		
		System.out.println(ans);
	}
}