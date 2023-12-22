import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, E, F;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		E = sc.nextInt();
		F = sc.nextInt();
		int ans1 = 100*A, ans2 = 0;
		double con = -1;
		for(int i = 0; 100*A*i <= F; i++) {
			for(int j = 0; 100*B*j <= F-100*A*i; j++) {
				for(int k = 0; C*k <= F-100*(A*i+B*j); k++) {
					for(int l = 0; D*l <= F-100*(A*i+B*j)-C*k; l++) {
						int water = 100 * A * i + 100 * B * j;
						int sugar = C * k + D * l;
						if(sugar == 0 || water == 0 || sugar*100 > E * water)
							break;
						if((double)100*sugar/(sugar+water) > con) {
							con = (double)100*sugar/(sugar+water);
							ans1 = water+sugar;
							ans2 = sugar;
						}
					}
				}
			}
		}
		System.out.println(ans1 + " " + ans2);
	}

}