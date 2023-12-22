import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		String slimes = sc.next();
		int type =0;

		for(int i=0 ; i<sum ; i++) {
			//iが0、またはslimesのi-1番目とi番目の文字が違うときに、typeを+1する
			if(i == 0 || (i>0 && slimes.charAt(i-1) != slimes.charAt(i))) {
				type++;
			}
		}
		System.out.print(type);
		sc.close();
	}
}
