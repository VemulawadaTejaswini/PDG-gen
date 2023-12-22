import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int a=1;
		int x=1;
		for(int i=1;i<=c;i++) {
			a = a*i;
		}
		for(int i=0;i<9;i++) {
			x *=10;
		}
		a =  a % (x+7);
		System.out.print(a);
		sc.close();

	}

}