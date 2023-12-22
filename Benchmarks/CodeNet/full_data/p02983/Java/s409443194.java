import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long l = in.nextLong();
		long r = in.nextLong();
		if(r-l+1>=2019) System.out.println(0);
		else {
			long min = Long.MAX_VALUE;
			for(long i=l;i<=r;i++) {
				for(long j=i+1;j<=r;j++) {
					long tmp = ((i%2019)*(j%2019))%2019;
					if(tmp<min) min = tmp;
				}
			}
			System.out.println(min);
		}
		
		in.close();

	}

}
