import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		scan.close();
		int l = 1;
		if(N == 0) {
			System.out.println(0);
			System.exit(0);
		}
		// 長さ2n + 1で表すことができる数値の最小値と最大値
		List<Long> list1 = new ArrayList<Long>();
		List<Long> list2 = new ArrayList<Long>();
//		while(true) {
//			int k = (int)Math.ceil((double) l / 2.0);
//			long max = (long)(Math.pow(4, k) - 1) / 3;
//			long t1 = (int)(Math.pow(2, l - 1));
//			long t2 = 2 * ((long)(Math.pow(4, k - 1)) - 1) / 3;
//			long min = t1 - t2;
//			list1.add(min);
//			list2.add(max);
//			if(min <= N && N <= max) {
//				break;
//			}else {
//				l += 2;
//			}
//		}
		for(int i = 1; i <= 31; i += 2) {
			int k = (int)Math.ceil((double) i / 2.0);
			long max = (long)(Math.pow(4, k) - 1) / 3;
			long t1 = (long)(Math.pow(2, i - 1));
			long t2 = 2 * ((long)(Math.pow(4, k - 1)) - 1) / 3;
			long min = t1 - t2;
			list1.add(min);
			list2.add(max);
		}
		list1.set(0, 0L);

		long t = N;
		int[] bi = new int[31];
//		if(t == 0) {
//			for(int i = 0; i < l; i++) {
//				System.out.print(bi[i]);
//			}
//			System.out.println();
//		}

		// 長さ2l で表すことができる数値の最小値と最大値
		List<Long> list3 = new ArrayList<Long>();
		List<Long> list4 = new ArrayList<Long>();
		for(int i = 2; i <= 31; i += 2) {
			int k = i / 2;
			long min = -2 * (long)(Math.pow(4, k) - 1) / 3;
			long t1 = -(long)(Math.pow(2, i - 1));
			long t2 = -((long)(Math.pow(4, k)) - 1) / 3;
			long max = t1 - t2;
			list3.add(min);
			list4.add(max);
		}

//		for(int i = 0; i < list1.size(); i++) {
//			System.out.println(list1.get(i) + " " + list2.get(i));
//		}
//		for(int i = 0; i < list3.size(); i++) {
//			System.out.println(list3.get(i) + " " + list4.get(i));
//		}
		while(t != 0) {
			if(t < 0) {
				for(int i = 0; i < list1.size(); i++) {
					if(list3.get(i) <= t && t <= list4.get(i)) {
						bi[(2 * (i + 1))] = 1;
						t = t + (long)(Math.pow(2, 2 * i + 1));
						break;
					}
				}
			}else if(t > 0) {
				for(int i = 0; i < list3.size(); i++) {
					if(list1.get(i) <= t && t <= list2.get(i)) {
						bi[(2 * i + 1)] = 1;
						t = t - (long)(Math.pow(2, 2 * i));
						break;
					}
				}
			}

		}
		int index = 0;
		for(int i = 0; i < 31; i++) {
			if(bi[i] == 1) {
				index = i;
			}
		}
		for(int i = index; i > 0; i --) {
			System.out.print(bi[i]);
		}
		System.out.println();

	}
}