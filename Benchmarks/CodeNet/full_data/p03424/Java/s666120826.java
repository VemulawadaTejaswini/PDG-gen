import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] n = new int[4];
		for (int i=0; i<N; i++) {
			String t = sc.next();
			if (t.compareTo("P") ==0 ) n[0]++;
			if (t.compareTo("W") ==0 ) n[1]++;
			if (t.compareTo("G") ==0 ) n[2]++;
			if (t.compareTo("Y") ==0 ) n[3]++;
		}
		int res = 0;
		for (int i=0; i<4; i++) {
			if (n[i] >0) res++;  
		}
		if (res == 3)
			System.out.println("Three");
		else if (res == 4)
			System.out.println("Four");
	}
}
