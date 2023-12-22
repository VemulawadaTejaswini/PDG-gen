import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		execute();
	}

	private static void execute() {
		try (Scanner sc = new Scanner(System.in)) {
			long a = sc.nextLong();

			long x=0;
			long y=0;
			
			for(long i=(long)Math.sqrt(a); i>0;i--) {
				if(a%i==0) {
					x=i;
					y=a/i;
					break;
				}
			}
			
			System.out.println(x + y - 2);

		}
	}

}