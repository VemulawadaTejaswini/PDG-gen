import java.util.Scanner;
public class Main {
	static long ate;
	static long atePatty = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long level =  Long.parseLong(sc.next());
		ate = Long.parseLong(sc.next());

		makeBurger(level);

		System.out.println(atePatty);
	}

	public static void makeBurger(long level) {
		if(level == 0) {
			if(ate > 0) {
				atePatty ++;
				ate --;
			}
		}else {
			if(ate > 0) {
				ate --;
				makeBurger(level - 1);
			}
			if(ate > 0) {
				atePatty ++;
				ate --;
				makeBurger(level - 1);
			}
			if(ate > 0) {
				ate --;
			}
		}
	}
}