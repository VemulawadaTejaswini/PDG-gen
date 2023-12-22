import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (scan.hasNext()){
			list.add(scan.nextInt());
		}
		int result = 0;
		Collections.sort(list);
		for (int i = 0; i < N;i++){
			int wk = 0;
			boolean fl = true;
			for (int j = 0; j <= i; j ++){
				wk = wk + list.get(j);
			}
			for (int k = i; k < N; k ++){
				if (wk * 2 >= list.get(k + 1)) {
					wk = wk + list.get(k + 1);
				} else {
					fl = false;
					break;
				}
			}
			if (fl){
				result = N - i;
				break;
			}
		}
		System.out.println(result);
	}
}
