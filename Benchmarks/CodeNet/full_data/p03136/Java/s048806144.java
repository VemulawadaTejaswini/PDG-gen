

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> L = new ArrayList<Integer>();
		for(int i = 0; i < N;i++) {
			int num = sc.nextInt();
			L.add(num);
			}
		int max = L.get(0);
//		リスト内の最大値をとる
		for (int i = 1; i <L.size(); i++) {
		    int v = L.get(i);
		    if (v > max) {
		        max = v;
		    }
		}

//		System.out.println(max);
//		System.out.println(sum);
		int sum = 0;
		for(int i = 0; i < L.size();i++) {
			sum = sum + L.get(i);
		}
		sum = sum - max;
		if(sum > max) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
//		System.out.println(sum);
//		System.out.println(max);
//		System.out.println(L);
//		String A = sc.next();
//1 8 10 5 8 12 34 100 11 3
//		double answer = T/X;
//
//		 String str = BigDecimal.valueOf(answer).toPlainString();
//
//
//		 System.out.println(answer);
	}
}
