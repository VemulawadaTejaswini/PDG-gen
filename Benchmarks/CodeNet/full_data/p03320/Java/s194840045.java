
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		long i=1;
		int j=0;
		while (k>0) {
			System.out.println(i*(long)Math.pow(10,j));
			if(i==9) {
				i=1;
				j++;
			} else {
				i++;
			}
			k--;
		}
	}



}
