import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[A];
        int amin = 100000;
        for(int i = 0; i < A; i++) {
        	a[i] = sc.nextInt();
        	amin = Math.min(amin, a[i]);
        }
        int[] b = new int[B];
        int bmin = 100000;
        for(int i = 0; i < B; i++) {
        	b[i] = sc.nextInt();
        	bmin = Math.min(bmin, b[i]);
        }
        int ans = amin + bmin;
        for(int i = 0; i < M; i++) {
        	int x = sc.nextInt()-1;
        	int y = sc.nextInt()-1;
        	int c = sc.nextInt();
        	ans = Math.min(ans, a[x]+b[y]-c);
        }
        System.out.println(ans);
    }
}