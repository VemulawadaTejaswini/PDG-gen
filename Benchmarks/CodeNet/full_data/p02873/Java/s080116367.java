import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
 
public class Main {

	public static final MyScanner in = new MyScanner();
	public static final Set<Long> set = new HashSet<Long>();
	public static PriorityQueue<Long> pq = new PriorityQueue<Long>();
	
	public static void main(String[] args) {

		final String S = in.nextLine();

		boolean gt = S.charAt(0) == '>'; 

//		char w = '_';

		int i = 0;
		int lt_cnt = -1;
		int gt_cnt = -1;
		int answer = 0;
//		List<Integer> lst = new ArrayList<Integer>();
		for (char c: S.toCharArray()) {
			if ( gt && c == '>') {
				gt = true;
				gt_cnt++;
//				lst.add(1);
			} else if ( !gt && c == '>' ) {
				gt = true;
				gt_cnt++;
//				lst.add(2);
			} else if (gt && c == '<') {
//				lst.add(3);
				gt = false;
				if (lt_cnt >= gt_cnt) {
					answer += ++lt_cnt;
//					System.out.print(lt_cnt);
					answer += sum(gt_cnt);
				}else {
					answer += sum(++gt_cnt);
				}
				gt_cnt = -1;
				lt_cnt = 0;
//				System.out.print(lt_cnt);
			} else if ( !gt && c == '<') {
//				lst.add(4);
				answer += ++lt_cnt;
//				System.out.print(lt_cnt);
			}
		}

		
		final char fc = S.charAt(S.length()-1);
		if ( fc == '>') {
			if (lt_cnt >= gt_cnt) {
				answer += ++lt_cnt;
//				System.out.print(lt_cnt);
				answer += sum(gt_cnt);
//				System.out.print(0);
			}else {
				answer += sum(++gt_cnt);
//				System.out.print(0);
			}
		}
		else {
			answer += ++lt_cnt;
//			System.out.print(lt_cnt);
		}

//		System.out.println();
//		lst.forEach(System.out::print);

//		System.out.println();
		System.out.println(answer);

	}

	public static int sum(int i) {
		int r = 0;
		while(i > 0) {
//			System.out.print(i);
			r += i;
			i--;
		}
		return r;
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}