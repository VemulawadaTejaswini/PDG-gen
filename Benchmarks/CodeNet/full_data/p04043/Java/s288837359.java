import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[3];
		for(int i = 0; i < 3; i++){
			num[i] = scanner.nextInt();
		}
		Arrays.sort(num);

		if(num[0] == 5){
			if(num[1] == 5 && num[2] == 7){
				System.out.println("YES");
			}
		}else{
			System.out.println("NO");
		}
	}
}