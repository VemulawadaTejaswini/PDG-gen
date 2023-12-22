import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(int i=0;i<n;i++){
			list.add( sc.nextLong());
		}
		Collections.sort(list);

		long diff = list.get(k-1) - list.get(0);
		// System.out.println("first diff"+diff);
		for(int i=0;i<n;i++){
			if(i<k){
				continue;
			}
			long curDiff = diff + (list.get(i)-list.get(i-1)) - (list.get(i-k+1)-list.get(i-k));
			
			// System.out.print("diff");
			// System.out.println(curDiff);
			
			diff = Math.min(diff, curDiff);
		}

		System.out.println(diff);


	}

}

