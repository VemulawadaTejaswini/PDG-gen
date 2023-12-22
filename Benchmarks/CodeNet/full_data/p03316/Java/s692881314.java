
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int moto=sc.nextInt();
		int wa=0;
		int tmp=moto;

		while(tmp>0) {
			wa+=tmp%10;
			tmp/=10;
		}

		if(moto%wa==0) {
			System.out.println("Yes");
		}

		else{
			System.out.println("No");
		}
	}
}