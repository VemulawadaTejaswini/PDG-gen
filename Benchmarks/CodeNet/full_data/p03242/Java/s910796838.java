import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		sc.close();
		String a [] = new String [3];
		a[0] = N.substring(0,1);
		a[1] = N.substring(1,2);
		a[2] = N.substring(2,3);

		for(int i = 0; i < 3; i++) {
			if(a[i].equals("1")) {
				a[i] = "9";
			}else if(a[i].equals("9")) {
				a[i] = "1";
			}
		}

		System.out.println(a[0]+a[1]+a[2]);

	}

}
