import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, c, k, r = 0, cnt = 0, f, i;
		n = sc.nextInt();
		c = sc.nextInt();
		k = sc.nextInt();
		int[] a = new int[n];
		for(i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		f = a[0];
		for(i = 0; i  < n; i++){
			if(cnt == c || f + k < a[i]){
				r++;
				f = a[i];
				cnt = 1;
			}else{
				cnt++;
			}
		}
		System.out.println(r);
	}
}
