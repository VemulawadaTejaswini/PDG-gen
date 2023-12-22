import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		String str =sc.next();
		if(str.length()==N) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		sc.close();
	}
}