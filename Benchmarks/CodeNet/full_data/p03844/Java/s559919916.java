import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		String t = sc.next();
		long b = Long.parseLong(sc.next());
		//int c = Integer.parseInt(sc.next());
		//int n = Integer.parseInt(sc.next());
		//long res=n;
		//int l = Integer.parseInt(sc.next());
		//int sum=0;
		//String s = sc.next();
		//String t = sc.next();
		//String b = sc.next();
		//int a = Integer.parseInt(sc.next());
		//String t = sc.next();

		if(t.equals("+")) {//a、e、i、o、u
			System.out.println(a+b);
		}else {
			System.out.println(a-b);
		}
		//System.out.println("A"+t.substring(0,1)+"C");
	}
}


