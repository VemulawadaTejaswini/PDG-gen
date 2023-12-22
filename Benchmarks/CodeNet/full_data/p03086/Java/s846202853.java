
import java.util.Scanner;

public class Main {
	public static int max_ACGT(String s) {
		int max = 0;
		int get_ACGT_num = 0;
		for(int i = 0; i < s.length(); i++) {
			int count = 0;
			while(count + i < s.length()) {
				if(s.charAt(i+count) == 'A' || s.charAt(i+count) == 'C' || s.charAt(i+count) == 'G' || s.charAt(i+count) == 'T') {
					count++;
				}else {
					break;
				}
				i += count;
				if(get_ACGT_num < count) {
					get_ACGT_num = count;
				}
			}
			if(get_ACGT_num > 1) {
				max = Math.max(max,get_ACGT_num);
				i += get_ACGT_num-1;
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		System.out.println(max_ACGT(S));
		sc.close();
	}

}
