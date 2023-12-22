import java.util.Scanner;
public class Main {
	public static boolean acgt(char c) {
		if(c == 'A' || c == 'C' || c == 'G' || c == 'T') {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int cnt = 0;
		int tmp = 0;
		for(char i:s) {
			if(acgt(i)) {
				cnt++;
				if(tmp < cnt)tmp = cnt;
			}else {
				cnt = 0;
			}
		}
		System.out.println(tmp);
		sc.close();
	}
}
