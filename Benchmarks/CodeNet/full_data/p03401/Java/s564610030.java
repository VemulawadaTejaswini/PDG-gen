import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n + 2];
	int[] b = new int[n + 1];
	for(int i = 1; i < n + 1; i++) {
		a[i] = sc.nextInt();
	}
	for(int i = 0; i <= n; i++) {
		b[i] = Math.abs(a[i + 1] - a[i]);
	}
	int sum = 0;
	for(int i = 0; i <= n; i++) {
		sum += b[i];
	}
	for(int i = 1; i < n + 1; i++) {
		System.out.println(sum - b[i - 1] - b[i] + Math.abs(a[i - 1] - a[i + 1]));
	}
}
}
