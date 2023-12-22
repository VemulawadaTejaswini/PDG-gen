
 import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=b*10;
		int f=0;
		for(int i=0;i<10;i++) {
			if(c*0.08==a) {
				f=1;
				break;

			}
			c++;
		}
		if(f==1) {
			System.out.println(c);

		}else {
			System.out.println(-1);
		}


	}

}
