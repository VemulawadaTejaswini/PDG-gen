import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = Integer.parseInt(sc.next());
		Integer[] a = new Integer[N];
		for(int i=0; i<N; i++){
			a[i] = Integer.parseInt(sc.next());
		}
		Integer b[] = new Integer[N];
		for(int i=0; i<N; i++){
			b[i] = Integer.parseInt(sc.next());
		}
		int sum_A = sum(a);
		int sum_B = sum(b);
		int ans=0;
		int under_count = 0;
		int over_count = 0;
		int need = 0;
		
		if(sum_A<sum_B){//準備不足
			ans = -1;
		}else{
			int diff[] = new int[N];
			for(int i=0;i<N;i++){
				diff[i] = a[i]-b[i];
				if(diff[i]<0){
					under_count++;
					need += -diff[i];
				}
			}
			Arrays.sort(a, Collections.reverseOrder());
			for(int i=0;i<N;i++){
				need -= a[i];
				if(need<=0)over_count++;
			}
		}
		ans = under_count + over_count;
		
		System.out.println(ans);
	}
	
	public static int sum(Integer[] b){
		int sum=0;
		for(int n : b){
			sum += n;
		}
		return sum;
	}
}