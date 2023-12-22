
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		if(b%a==0) {
			System.out.println(b/a);
		}else {
			System.out.println(b/a+1);
		}
	}

}
