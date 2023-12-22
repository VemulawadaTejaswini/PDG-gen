
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double p = 0;
		if(n % 2 == 0){
			p = 0.5;
		}else{
			p = (double)(n / 2 + 1) / n;
		}
		System.out.println(p);
	}
}
