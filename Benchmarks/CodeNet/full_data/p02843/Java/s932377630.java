public class Main {
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		//		if(x<100 || (105 < x && x < 200) || (210 < x && x < 300) || (315 < x && x < 400) || (420 < x && x < 500) || (525 < x && x < 600) || (635 < x && x < 700) || (
		//740 < x && x < 800) || (845 < x && x < 900) || (950 < x && x < 1000) || (1055 < x && x < 1100) || (1160 < x && x < 1200) || (1265 < x && x < 1300) || (1370 < x && x < 1400) || (1475 < x && x < 1500) || (1580 < x && x < 1600) || (1685 < x && x < 1700) || (
		//		1790 < x && x < 1800) || (1895 < x && x < 1900)) {
		//			System.out.println(0);
		//		}else {
		//			System.out.println(1);
		//		}

		boolean flg = false;

		flg = (x < 100);

		for (int i = 2; i <= 19; i++) {
			if (flg) {
				System.out.println(0);
				break;
			}
			flg = flg && (((i - 1) * 105 < x) && (x < i * 100));
		}

		System.out.println(1);

	}
}
