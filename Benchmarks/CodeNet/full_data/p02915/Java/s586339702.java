
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int temp=1;
		for(int i=0;i<3;i++) {
			temp*=n;
		}
		System.out.println(temp);
	}

}
