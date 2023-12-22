import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int d = sc.nextInt();
	int x = sc.nextInt();
	int[] a = new int[n];
	for(int i = 0; i < n; i++) {
		a[i] = sc.nextInt();
	}
	int cout = 0;
	int p = 1;
	for(int i = 0; i < n; i++) {
		while((p) * a[i] + 1 <= d) {
			cout++;
			p++;
		}
		p = 1;
	}
	System.out.println(n + cout + x);
}
}
