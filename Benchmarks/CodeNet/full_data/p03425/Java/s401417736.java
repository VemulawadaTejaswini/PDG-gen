
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s ="";
		long m=0,a=0,r=0,c=0,h=0;
		for(int i=0;i<n;i++) {
			s=sc.next();
			s = String.valueOf(s.charAt(0));
			if(s.equals("M")) {
				m++;
			}
			if(s.equals("A"))
				a++;
			if(s.equals("R"))
				r++;
			if(s.equals("C"))
				c++;
			if(s.equals("H"))
				h++;

		}
		long kekka = m*(a*(r+c+h)+r*(c+h)+c*h)+a*(r*(c+h)+c*h)+r*c*h;
		System.out.print(kekka);

	}

}
