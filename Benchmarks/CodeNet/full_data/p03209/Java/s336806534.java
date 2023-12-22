import java.util.Scanner;
public class Main {
	static long eaten;
	static long eatenPatty = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long level =  Long.parseLong(sc.next());
		eaten = Long.parseLong(sc.next());

		makeBurger(level);

		System.out.println(eatenPatty);
	}

	public static void makeBurger(long level) {
		if(level == 0) {
			if(eaten > 0) {
				eatenPatty ++;
				eaten --;
			}
		}else {
			long gapEaten = 0;
			long gapEatenPatty = 0;
			if(eaten > 0) {
				eaten --;
				long prvEaten = eaten;
				long prvEatenPatty = eatenPatty;
				makeBurger(level - 1);
				gapEaten = eaten - prvEaten;
				gapEatenPatty = eatenPatty - prvEatenPatty;
			}
			if(eaten > 0) {
				eatenPatty ++;
				eaten --;
				if(eaten + gapEaten >= 0) {
					eaten += gapEaten;
					eatenPatty += gapEatenPatty;
				}else {
					makeBurger(level - 1);
				}
			}
			if(eaten > 0) {
				eaten --;
			}
		}
	}
}