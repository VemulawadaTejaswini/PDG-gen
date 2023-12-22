import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		long i=0;
		long x = scan.nextLong();
		long y = scan.nextLong();
		for(i=(long)Math.pow(10,18);i>0;i--) {
			if(i%x==0) {
				if(i%y!=0) {
					System.out.println(i);
					break;
				}
			}
		}
		if(i==0) {
			System.out.println(-1);
		}
	}
}