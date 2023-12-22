import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0,index;
		double avg,min;
		for(int i = 0;i < n;i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		avg = (double)sum / (double)n;
		min = Math.abs((double)a[0] - avg);
		index = 0;
		for(int i = 1;i < n;i++) {
			if(min > Math.abs((double)a[i] - avg)){
				min = Math.abs((double)a[i] - avg);
				index = i;
			}
		}
		System.out.println(index);

	}
}