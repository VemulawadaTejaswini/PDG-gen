import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bigdecimal N = sc.nextInt();
		bigdecimal K = sc.nextInt();
		bigdecimal count = 1;
		while (N >= K) {
			N = N / K;
			count++;
		}
		System.out.println(count);
		return ;
	}
}