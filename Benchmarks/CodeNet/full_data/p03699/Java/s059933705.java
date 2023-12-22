import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] s = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++){
			s[i] = scanner.nextInt();
			sum += s[i];
		}
		Arrays.sort(s);
		for(int i=0;i<n;i++){
			if(sum % 10 == 0){
				sum -= s[i];
			}else{
				System.out.println(sum);
				return;
			}
		}
		System.out.println(0);
	}

}
