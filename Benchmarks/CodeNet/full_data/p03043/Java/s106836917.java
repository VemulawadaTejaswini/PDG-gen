
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double k = sc.nextDouble();
		sc.close();
		
		double p = 0;
		
		for(int i=1; i<=n; i++) {
			if(i<k) {
				p += 1/n * Math.pow(0.5, (int)(Math.log10((k-1)/i)/Math.log10(2)+1));
			}else {
				p += 1/n;
			}
		}
		System.out.println(p);
	}

}
