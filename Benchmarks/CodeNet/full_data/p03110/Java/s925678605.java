import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		double ans=0;
		String money;
		String[] tmp;
		double amount;
		for(int i=0; i<n; i++) {
			tmp=sc.nextLine().split(" ");
			amount=Double.parseDouble(tmp[0]);
			money=tmp[1];
			if(money.equals("JPY"))
				ans+=amount;
			else
				ans+=amount*380000;
		}
		System.out.println(ans);
	}
}