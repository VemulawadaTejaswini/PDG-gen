import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long N=scanner.nextLong();
		for(int h=1;h<=3500;h++) {
			for(int n=1;n<=3500;n++) {
				if((4*h*n-N*n-N*h)!=0&&(N*h*n)%(4*h*n-N*n-N*h)==0) {
					long w=(N*h*n)/(4*h*n-N*n-N*h);
					if(w<1)continue;
					System.out.println(h+" "+n+" "+w);
					return;
				}
			}
		}
	}
}
