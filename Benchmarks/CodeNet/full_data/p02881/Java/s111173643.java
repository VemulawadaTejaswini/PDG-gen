import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int k = 0;
		
		for(int i = 1; i <= n/2; i++) {
			if(n%i == 0) {
				int b = n/i; //商
				a[k] = compare(i,b);
				k++;
			}

		}

		int min = Integer.MAX_VALUE;
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
		list.remove(0);
		
		for(int i = 0; i < a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);

	}
	static int compare(int a, int b) {  //移動回数の合計を出すメソッド
		int count = 0;
		count += a-1;
		count += b-1;
		return count;
	}


}
