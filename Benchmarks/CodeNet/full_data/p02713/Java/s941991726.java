import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		int[] c = sosu(200);
		for(int i = 1; i < a+1; i++) {
			for(int j = 1; j < a+1; j++) {
				for(int k = 1; k < a+1;k++) {
					b += gcd(i,j,k,c);
				}
			}
		}
		System.out.println(b);
	}
	static int gcd(int a,int b,int c,int[] s) {
		int d = 1;
		for(int i = 0; i < Math.max(Math.max(a, b),c); i++) {
			if(s[i] != 0) {
				if(a%s[i] == 0 && b%s[i] == 0 && c%s[i] == 0) d *= s[i];
			}
		}
		return d;
	}
	static int[] sosu(int a) {
		int[] b = new int[a];
		for(int i = 0; i < a; i++) {
			b[i] = i+1;
		}
		for(int i = 1; i < a; i++) {
			if(b[i] != 0) {
				for(int j = 0;j < a; j++) {
					if(i != j && b[j] % b[i] == 0)b[j] =0;
				}
			}
		}
		return b;
	}
}
