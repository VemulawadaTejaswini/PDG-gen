
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 2;
		int j = 0;
		int k = sc.nextInt();
		while (k>0) {
			System.out.println(i*(long)Math.pow(10, j)-1);
			if(i==10) {
				i=2;
				j++;
			}else {
				i++;
			}
			k--;
		}
	}
	
	


}
