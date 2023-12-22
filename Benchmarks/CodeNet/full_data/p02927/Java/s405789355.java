import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int count=0,buff1,buff2;

		for(int i=1;i<=m;i++) {
			for(int j=1;j<=d;j++) {
				buff1 = j%10;
				buff2 = j/10;
				if(buff1==1 || buff2==1) {
					break;
				}
				if(m == buff1*buff2) {
					count++;
				}
			}
		}
		System.out.println(count);


	}

}
