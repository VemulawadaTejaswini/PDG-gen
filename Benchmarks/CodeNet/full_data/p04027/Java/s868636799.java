
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main{

	static List<Integer> list;
	static List<Integer> list2;
	static int sum = 0;

	static void walk(int remainCan, int childnum, int remainChild, int temp) {
		if (remainChild == 1) {
			System.out.println("temp 1:" + temp);
			temp *= Math.pow(list.get(childnum), remainCan);
			System.out.println("sum :" + sum + " x:" + list.get(childnum)
					+ " y:" + remainCan + "  temp:" + temp);
			sum += temp;

			System.out.println("sum:" + sum);
		} else {
			for (int i = 0; i <= remainCan; i++) {
				System.out.println("t1:" + temp);
				if (childnum == 0)
					temp = 1;// 不明白哪里错
				temp *= Math.pow(list.get(childnum), i);

				System.out.println("x:" + list.get(childnum) + " y:" + i);
				System.out.println("t2:" + temp);
				walk(remainCan - i, childnum + 1, remainChild - 1, temp);
			}

		}
	}

	// 剩下n个数,NO为第几个数
	static void walk2(int n, int NO,int K,int N) {
		if (n == 0) {
			walk(K, 0, N, 1);
		} else {
			for (int i = list.get(NO); i <= list2.get(NO); i++) {
				walk2(n - 1, NO + 1,K,N);
				if (list.get(NO)< list2.get(NO)) {
					list.add(NO, list.get(NO) + 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		list = IntStream.range(0, N).mapToObj(x -> sc.nextInt())
				.collect(Collectors.toCollection(ArrayList::new));

		list2 = IntStream.range(0, N).mapToObj(x -> sc.nextInt())
				.collect(Collectors.toCollection(ArrayList::new));

		//walk(K, 0, N, 1);
		walk2(N, 0, K, N);
		System.out.println(sum);
	}

}