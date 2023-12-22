
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		int num=10,x=10;
		num*=str.charAt(0)-'0';
		num+=str.charAt(1)-'0';
		num*=10;
		num+=str.charAt(2)-'0';
		num*=10;
		num+=str.charAt(3)-'0';
		x*=str.charAt(5)-'0';
		x+=str.charAt(6)-'0';
		if(num>=2019&&x>4) {
			System.out.println("TBD");
		}else {
			System.out.println("Heisei");
		}
	}

}
