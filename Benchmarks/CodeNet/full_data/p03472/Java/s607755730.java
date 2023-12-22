import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		
		int n,h,max = 0;
		n = sc.nextInt();
		h = sc.nextInt();
		
		int count = 0;
		Integer a[] = new Integer[n]; //何回でも
		Integer b[] = new Integer[n]; //一回だけ
		
		for(int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			max = Math.max(max,a[i]); //aのうち最大
		}
		
		Arrays.sort(b,Collections.reverseOrder());
		
		
		for(int i = 0; i < n; i++) {
			if(b[i] >= max) {
				h -= b[i];
				count++;
			}else {
				break;
			}
		}
		
		count += h/max;
		
		System.out.println(count);
	}
	

}
