import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Runnable{
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		sc.close();
		sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String[] strs = s.split(" ");
		List<Integer> d = new ArrayList<>();
		for (String str : strs) {
			d.add(Integer.parseInt(str));
		}

		boolean isGood = false;
		int len;
		while (true) {
			len = String.valueOf(n).length();
			for (int i = 0; i < len; i++) {
				if (d.contains((n % (int)Math.pow(10, i+1)) / (int)Math.pow(10, i))) {
					break;
				}
				if (i == len - 1) {
					isGood = true;
				}
			}

			if (isGood) {
				System.out.println(n);
				return;
			}
			n++;
		}


	}
}
