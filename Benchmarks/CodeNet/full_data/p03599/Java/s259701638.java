import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();

		int waterA;
		int waterB;
		int remain;
		int remainSugar;
		int sugarC;
		int sugarD;
		double noudo;
		double noudoMax = 0;
		int ansWater = 0;
		int ansSugar = 0;

		for (int i=0; (100*A*i)<=F; i++){
			waterA = 100*A*i;
			for (int j=0; (waterA + (100*B*j)) <=F; j++){
				waterB = 100*B*j;
				remain = F - (waterA + waterB);
				remainSugar = (waterA + waterB) * E / 100;
				for (int k=0; k*C<=remain && k*C <=remainSugar; k++){
					sugarC = k*C;
					for (int l=0; l*D<=(remain-sugarC) && l*D <= (remainSugar - sugarC); l++){
						sugarD = l*D;
						if (waterA + waterB > 0){
							noudo = (double)(sugarC + sugarD) / (double)(waterA + waterB);
							if (noudo > noudoMax){
								ansWater = waterA + waterB;
								ansSugar = sugarC + sugarD;
								noudoMax = noudo;
							}
						}
					}
				}
			}
		}
		System.out.println(ansWater + ansSugar + " " + ansSugar);
	}
}
