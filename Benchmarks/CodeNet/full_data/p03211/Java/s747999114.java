import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str+="E";
		int min = Integer.MAX_VALUE;

		for(int i=0; i<str.length()-3;i++) {
			Integer num = Integer.valueOf(str.substring(i,i+3));
			int abs = Math.abs(753-num);
			if(abs<min) {
				min=abs;
			}
		}
		System.out.println(min);
	}
}