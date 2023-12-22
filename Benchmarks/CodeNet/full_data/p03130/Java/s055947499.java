
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a=0,b=0,c=0,d=0;

		for(int i=0;i<6;i++) {
			switch(sc.nextInt()) {

			case 1:
				a++;
				break;
			case 2:
				b++;
				break;
			case 3:
				c++;
				break;
			case 4:
				d++;
				break;
			}

		}

		int c1=0;
		if(a==1) {
			c1++;
		}
		if(b==1) {
			c1++;
		}
		if(c==1) {
			c1++;
		}
		if(d==1) {
			c1++;
		}

		sc.close();

		System.out.println(c1==2 ? "YES" : "NO");


	}

}
