public class Main {

	public static void main(String[] args) {

		Integer n = null;
		Integer x = null;
		Integer y = null;
		boolean err = false;

		if (args.length < 2) {
			System.out.println("入力が不足しています。");
            err = true;
		}
		try {
			n = Integer.parseInt(args[0]);
			x = Integer.parseInt(args[1]);
			y = Integer.parseInt(args[2]);
		}
		catch (Exception e) {
			System.out.println("不正な入力が含まれています。");
			err = true;
		}

		if (err == false) {
		// 最大値と最小値を求める
			Integer max;
			Integer min;

			if (x < y){
				max = x;
			}
			else {
				max = y;
			}

			if (x + y <= n) {
				min = 0;
			}
			else {
				min = (x + y) - n;
			}

			System.out.println(max + " " + min);
		}
	}
}
