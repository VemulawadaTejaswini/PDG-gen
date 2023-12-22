import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = scanner.nextInt();
		}


		Arrays.sort(a);
		String result = "YES";
		for(int i = 0; i<a.length-1; i++){
			if(a[i] == a[i+1]){
				result = "NO";
				break;
			}
		}

		System.out.println(result);
	}

}
