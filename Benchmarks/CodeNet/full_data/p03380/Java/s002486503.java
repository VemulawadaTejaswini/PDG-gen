import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
		}
		Arrays.sort(x);
		int maxkey = n-1;
		int max = x[maxkey];
		int minkey = 0;
		int min = x[minkey];
		int midkey = 0;
//		int idealint = x[n-1]/2;
				
		do{
			midkey = (maxkey + minkey)/2;
			if( x[midkey] == x[n-1]/2){

				break;
			}else if(x[midkey] > x[n-1]/2 ) {
				maxkey = midkey - 1;
			}else  {
				minkey = midkey +1;
			}
			
		}while (minkey < maxkey);
		if(Math.max(x[n-1] - x[minkey],x[minkey]) >= Math.max(x[n-1] - x[minkey-1],x[minkey-1])) {
			minkey--;
		}else if(Math.max(x[n-1] - x[minkey],x[minkey]) >= Math.max(x[n-1] - x[minkey+1],x[minkey+1])) {
			minkey++;
		}
		System.out.printf("%d%s%d", x[n-1], " ", x[minkey]);
	}

}