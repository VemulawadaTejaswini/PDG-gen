import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean ans = false;
		String S = sc.next();
		String firstHalf = S.substring(0, N / 2);
		String secondHalf = S.replaceFirst(firstHalf, "");
		
		if(2 <= N && firstHalf.equals(secondHalf)) {
			ans = true;
		}
		System.out.println(ans);
		sc.close();
	}
}