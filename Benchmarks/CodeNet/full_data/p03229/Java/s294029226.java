import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n;i ++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int mid,min = 0,max = n - 1,cnt = 0,sum = 0;
		if(n % 2 == 0) {
			mid = n / 2 - 1;
			while(min < mid && max > mid) {
				//System.out.println(a[max]+"-"+a[min]);
				sum += a[max] - a[min];
				if(cnt % 2 == 0) max --;
				else min ++;
				cnt++;
			}
			sum += a[n-1] - a[mid];
		}else {
			int sum1 = 0,sum2 = 0;
			mid = n / 2;
			while(min < mid && max > mid) {
				//System.out.println(a[max]+"-"+a[min]);
				sum1 += a[max] - a[min];
				if(cnt % 2 == 0) max --;
				else min ++;
				cnt++;
			}
			//System.out.println(a[n-1]+"-"+a[mid]);
			sum1 += a[n-1] - a[mid];
			
			cnt = 0; min = 0; max = n - 1;
			while(min < mid && max > mid) {
				//System.out.println(a[max]+"-"+a[min]);
				sum2 += a[max] - a[min];
				if(cnt % 2 == 0) min ++;
				else max --;
				cnt++;
			}
			//System.out.println(a[mid]+"-"+a[0]);
			sum2 += a[mid] - a[0];
			if(sum1 >= sum2) sum = sum1;
			else sum = sum2;
		}
		System.out.println(sum);
	}
}