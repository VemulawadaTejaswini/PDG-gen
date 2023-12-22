import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(a * i <= t){
			sum += b;
			i += 1;
		}
		System.out.println(sum);
	}
}