import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[M];
		int h=0;
		int l=0;
		for(int i =0; i<=M-1; i++) {
			A[i] = sc.nextInt();
		}
		for(int i =0; i<=M-1; i++) {
			if(A[i]<X) {
				l++;
			}else {
				h++;
			}
		}
		if(l>h) {
			System.out.println(h);
		}
		else if(l < h) {
			System.out.println(l);
		}else {
			System.out.println(l);
		}
	}
}