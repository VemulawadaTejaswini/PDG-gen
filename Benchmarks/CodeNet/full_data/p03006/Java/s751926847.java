import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int point[][] = new int[num][2];
		for(int i = 0; i < num; i ++) {
			point[i][0] = sc.nextInt();
			point[i][1] = sc.nextInt();
		}
		Arrays.sort(point, (a, b) -> Integer.compare(b[1], b[1]));
		Arrays.sort(point, (a, b) -> Integer.compare(a[0], b[0]));

		int min = 100_100;
		if(num == 1) { System.out.println(1); return; }
		for(int i = 0; i < num; i ++) {
			for(int j = 0; j < i; j ++) {
				int p = point[i][0] - point[j][0];
				int q = point[i][1] - point[j][1];
				int count = num;
				for(int i2 = 0; i2 < num; i2 ++) {
					for(int j2 = 0; j2 < num; j2 ++) {
						if(point[i2][0] - point[j2][0] == p && point[i2][1] - point[j2][1] == q) {
							count --;
							break;
						}
					}
				}
				min = Math.min(min, count);
			}
		}
		System.out.println(min);
	}
}