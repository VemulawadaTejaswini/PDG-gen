
import java.util.Scanner;

public class Main {

	public static int a,b,c,d,e,f;

	public static int water(int i, int j) {
		return 100*i*a + 100*j*b;
	}
	public static int sugar(int i, int j) {
		return i*c + j*d;
	}
	public static double noudo(int w, int s) {
		if(w == 0) return 0;
		else return (double)s/ ((double)w+(double)s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();

		int max_w = 0;
		int max_s = 0;
		//i,j,k,lは操作の回数
		for(int i =0; i<=30; i++) {
			for(int j=0; j<=30; j++) {
				for(int k=0; k<=100; k++) {
					for(int l=0; l<=100; l++) {
						if(water(i,j)+sugar(k,l)<=f && noudo(water(i,j),sugar(k,l))<=noudo(100,e)) {
							if(noudo(water(i,j),sugar(k,l)) >= noudo(max_w, max_s)) {
								max_w = water(i, j);
								max_s = sugar(k,l);
							}
						}
					}
				}
			}
		}
		int ans = max_w+max_s;
		System.out.println(ans+" "+max_s);

	}
}
