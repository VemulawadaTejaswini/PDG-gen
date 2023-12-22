import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int n3 = scn.nextInt();
		int n4 = scn.nextInt();
		int total = 0;
		if(n1>=n2) {
			total+=n2*n3;
			n1-=n2;
		}else {
			total+=n1*n3;
			n1 = 0;
		}
		total+=n1*n4;
		System.out.println(total);
		scn.close();
	}
}