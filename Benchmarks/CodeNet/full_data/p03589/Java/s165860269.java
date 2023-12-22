import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		boolean end = false;
		long h = 1;
		long n = 1;
		long w = 1;
		for(h=1; h<=3500; h++){
			if (4 * h < N){
				continue;
			}
			for (n=1; n<=3500; n++){
				if ((4 * h * n) < N *(h + n)){
					continue;
				}
				for (w=1; w<=3500; w++){
					if ((4 * h * n * w) == N *(h*n + h*w + n*w)){
						end = true;
						break;
					}
				}
				if (end){
					break;
				}
			}
			if (end){
				break;
			}
		}
		System.out.println(h + " " + n + " " + w);
	}
}
