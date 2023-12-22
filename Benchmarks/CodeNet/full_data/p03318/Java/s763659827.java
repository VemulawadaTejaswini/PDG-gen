import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long k = in.nextLong();
		long digit = 1;
		while(k>0) {
			for(int i=1;i<10 && k>0;i++) {
				StringBuilder sb = new StringBuilder();
				sb.append(i);
				for(int j=1;j<digit;j++) {
					sb.append("9");
				}
				System.out.println(sb.toString());
				k--;
			}
			digit++;
		}
	}

}