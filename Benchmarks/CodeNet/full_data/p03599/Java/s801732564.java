import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		
		int water = 0;
		int suger = 0;
		int watmax = 0;
		int sugmax = 0;
		double maxnodo = 100 * E / (100 + E);
		double nodo = 0;
		
		for(int a = 0; a <= F / 100; a += A) {
			for(int b = 0; b <= F / 100; b += B) {
				for(int c = 0; c <= F; c += C) {
					for(int d = 0; d <= F; d += D) {
						water = 100 * a + 100 * b;
						suger = c + d;
						if(water == 0 || water + suger > F) {
							break;
						} else if(100 * suger / (water + suger) >= nodo && 100 * suger / (water + suger) <= maxnodo && water + suger <= F) {
							watmax = water;
							sugmax = suger;
							nodo = Math.max(nodo, 100 * suger / (water + suger));
						}
					}
				}
			}
		}
		System.out.println(watmax + sugmax + " " + sugmax);
	}
}
