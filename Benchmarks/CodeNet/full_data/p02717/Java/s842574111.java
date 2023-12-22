import java.util.*;


public class Main {

	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x  = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int ary[] = new int[3];
		
		ary[0] = x;
		ary[1] = y;
		ary[2] = z;
		
		ary[0] = ary[1];
		ary[1] = x;
		
		ary[0] = z;
		ary[2] = y;
		
		sc.close();
		log( ary[0] + " " + ary[1] + " " + ary[2]);
	}
}	
