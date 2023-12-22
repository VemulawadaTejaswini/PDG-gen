import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n==0){
			System.out.println(0);
			return;
		}
		String s="";
		int a = 1;
		int m = 1;
		while (n!=0){
			int d =0;
			if (Math.abs(n)%2==1) d = 1;
			s = d + s;
			n = (n - d*m )/2;
			m*=-1;
		}
		System.out.println(s);
	}

}
