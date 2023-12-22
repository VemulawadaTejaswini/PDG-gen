import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long num = sc.nextInt(), tmp;
		for(long l = 1; l <= num; l++) {
			if(l > 135)return;
			String str = "";
			if(l % 9 > 0)str += l%9;
			tmp = l / 9;
			while(tmp > 0) {
				str += "9";
				tmp--;
			}
			System.out.println(str);
		}
	}
}