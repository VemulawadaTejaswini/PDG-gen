import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		long[] area = new long[4];
		Arrays.fill(area, Long.MAX_VALUE);
		// 縦に3分割
		for(int i = 1 ; i < w ; i++) {
			long[] inner = new long[3];
			inner[0] = i * h;
			inner[1] = w / 3 * h;
			inner[2] = (w + 2) / 3 * h;
			long max = Math.max(inner[0], Math.max(inner[1], inner[2]));
			long min = Math.min(inner[0], Math.min(inner[1], inner[2]));
			if(area[0] > max - min) {
				area[0] = max - min;
			}
		}
		// 横に3分割
		for(int i = 1 ; i < h ; i++) {
			long[] inner = new long[3];
			inner[0] = i * w;
			inner[1] = h / 3 * w;
			inner[2] = (h + 2) / 3 * w;
			long max = Math.max(inner[0], Math.max(inner[1], inner[2]));
			long min = Math.min(inner[0], Math.min(inner[1], inner[2]));
			if(area[1] > max - min) {
				area[1] = max - min;
			}
		}
		// 縦半分に分割=>横半分に分割
		for(int i = 1 ; i < w ; i++) {
			long rest = w - i;
			long[] inner = new long[3];
			inner[0] = i * h;
			inner[1] = h / 2 * rest;
			inner[2] = (h + 1) / 2 * rest;
			long max = Math.max(inner[0], Math.max(inner[1], inner[2]));
			long min = Math.min(inner[0], Math.min(inner[1], inner[2]));
			if(area[2] > max - min) {
				area[2] = max - min;
			}
		}
		// 横半分に分割=>縦半分に分割
		for(int i = 1 ; i < h ; i++) {
			long rest = h - i;
			long[] inner = new long[3];
			inner[0] = i * w;
			inner[1] = w / 2 * rest;
			inner[2] = (w + 1) / 2 * rest;
			long max = Math.max(inner[0], Math.max(inner[1], inner[2]));
			long min = Math.min(inner[0], Math.min(inner[1], inner[2]));
			if(area[3] > max - min) {
				area[3] = max - min;
			}
		}
		System.out.println(Arrays.toString(area));
		Arrays.sort(area);
		System.out.println(area[0]);
	}
}
