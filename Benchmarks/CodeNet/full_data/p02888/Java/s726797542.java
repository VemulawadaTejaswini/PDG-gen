
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> L = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			L.add(sc.nextInt());
		}
		
		Collections.sort(L);
		//小さい順に並んでいる。
		
		
		//三角形ができない組み合わせを数える。
		long count=0;
		long count_memo=0;
		
		int sh =0;
		int mi =0;
		int sum=0;
		for(int i=0;i<N-2;i++) {
			sh=L.get(i);
			for(int j=i+1;j<N-1;j++) {
				mi=L.get(j);
				sum = sh + mi;
				int k=L.size();
				count_memo=count;
				while(sum<=L.get(k-1)) {
					count++;
					k--;
				}
				if(count_memo==count) {
					break;
				}
			}
		}
		
		//組み合わせの総数　
		long total = (long)(N*(N-1)*(N-2))/(3*2); 
		
		long ans = total-count;
		
		System.out.println(ans);
	}
}
