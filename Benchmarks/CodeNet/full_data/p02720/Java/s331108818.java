import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long count = 1;
		int c = 1;
		if(String.valueOf(N).length()==1) {
			System.out.println(N);
			System.exit(0);
		}
		while(true) {
			if(run(c)) {
				count++;
			}
			c++;
			if(count==N+1) {
				break;
			}

		}System.out.println(c-1);
	}

	public static boolean run(long count) {
		for(int i=0; i<String.valueOf(count).length()-1;i++) {
			long a;
			a = count % 10;
			count /= 10;
			long b=count%10;
			if(Math.abs(a-b)>1) {
				return false;
			}
		}return true;
	}
}
