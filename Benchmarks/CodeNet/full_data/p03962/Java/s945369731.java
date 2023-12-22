import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = 0;
		if (a == b) {
			ans +=1;
		}
		if(b==c) {
			ans +=1;

		}
		if(a==c) {
			ans +=1;
		}
		if(3-ans==0) {
			System.out.println("1");
		}
		else {
		System.out.println(3-ans);}}
}