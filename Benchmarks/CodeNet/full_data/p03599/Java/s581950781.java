import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, C, D, E, F;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		E = sc.nextInt();
		F = sc.nextInt();
		double ans1 = 0, ans2 = 0;
		double con = 0;
		for(int i = 0; 100*A*i <= F; i++) {
			for(int j = 0; 100*B*j <= F-100*A*i; j++) {
				for(int k = 0; C*k <= F-100*(A*i+B*j); k++) {
					for(int l = 0; D*l <= F-100*(A*i+B*j)-C*k; l++) {
						double water = 100 * A * i + 100 * B * j;
						double sugar = C * k + D * l;
						if(sugar == 0 || water == 0 || water+sugar > F)
							break;
						if(sugar*100 <= E * water) {
							if(100*sugar/(sugar+water) > con) {
								con = 100*sugar/(sugar+water);
								ans1 = water+sugar;
								ans2 = sugar;
							}
						}
					}
				}
			}
		}
		System.out.println((int)ans1 + " " + (int)ans2);
	}

}