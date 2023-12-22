import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var v = new int[n][3];
		for (var i = 0; i < n; i++) {
			v[i][0] = sc.nextInt();
			v[i][1] = sc.nextInt();
			v[i][2] = sc.nextInt();
		}
		sc.close();

		for (var i = 0; i <= 10000; i++) {
			var x = i / 100;
			var y = i % 100;
			var h = 0;
			for (var j = 0; j < n; j++) {
				var h2 = Math.abs(v[j][0] - x) + Math.abs(v[j][1] - y) + v[j][2];
				if (j == 0) {
					h = h2;
				} else if (h != h2) {
					h = 0;
					break;
				}
			}
			if (h > 0) {
				System.out.printf("%d %d %d\r\n", x, y, h);
				break;
			}
		}
	}
}
