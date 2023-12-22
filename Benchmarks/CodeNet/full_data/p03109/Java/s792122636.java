import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		sc.close();
		String tmp = s.substring(5,  7);
		String tmp2 = s.substring(8, 10);
		int month = Integer.parseInt(tmp);
		int day = Integer.parseInt(tmp2);
		String ans[] = {"Heisei", "TBD"};
		int a = 0;
		if(month > 4)a = 1;
		System.out.println(ans[a]);
	}

}
