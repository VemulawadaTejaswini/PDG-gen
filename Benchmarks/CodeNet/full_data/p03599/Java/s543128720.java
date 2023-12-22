import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		
		
		int maxWater = 0;
		int maxSugar = 0;
		float maxConcentration = 0;
		for (int a = 0; a <= F/100; a+=A) {
			for (int b = 0; b <= F/100-a; b+=B) {
				float water = a*100+b*100;
				for (int c = 0; c <= F-water; c+=C) {
					for (int d = 0; d <= F-water-c; d+=D) {
						int sugar = c + d;
						
						if (water == 0)
							continue;
						
						if (water/100 * E < sugar)
							continue;
						
						if (water + sugar > F)
							continue;
						
						if ((float)((sugar * 100) / (water + sugar)) >= maxConcentration) {
							maxConcentration = (float)((sugar * 100) / (water + sugar));
							maxWater = (int) water;
							maxSugar = sugar;
						}
					}
				}
			}
		}
		
		System.out.println(maxWater+maxSugar + " " + maxSugar);
		
	}
	
}
