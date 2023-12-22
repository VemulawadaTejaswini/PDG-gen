import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ab_count = 0;
		int head_b = 0;
		int tail_a = 0;
		int contain_ba = 0;
		// 整数の入力
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			String s = sc.next();
			boolean aflag = false;
			for(char c: s.toCharArray()) {
				if (aflag && c == 'B') {
					ab_count++;
				}
				
				if (c == 'A') {
					aflag = true;
				} else {
					aflag = false;
				}
			}
			if(s.toCharArray()[0] == 'B') {
				head_b++;
			}
			
			if(s.toCharArray()[s.length()-1] == 'A') {
				tail_a++;
				if(s.toCharArray()[0] == 'B') {
					
					contain_ba++;
				}
			}
			

		}
		
		int ab = Math.min(tail_a, head_b);
		if (tail_a == contain_ba && head_b == contain_ba) {
			ab--;
		}
		System.out.println(ab+ab_count);
		
//		System.out.println(ab_count);
//		System.out.println(head_b);
//		System.out.println(tail_a);
//		System.out.println(contain_ba);


	}
}