import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next(),t=sc.next();
		int a=sc.nextInt(),b=sc.nextInt();
		String u=sc.next();

		if(s.equals(u)) {
			System.out.println((a-1)+" "+b);
		}else {
			System.out.println(a+" "+(b-1));
		}
	}

}
