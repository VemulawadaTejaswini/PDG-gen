import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(arr[0] == 5 &&
		arr[1] == 5 &&
		arr[2] == 7) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
