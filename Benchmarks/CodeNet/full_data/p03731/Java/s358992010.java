import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		long n=scanner.nextLong();
		long t=scanner.nextLong();

		long a = scanner.nextLong();
		long count=0;
		for(int i=0;i<n-1;i++){
			long b = scanner.nextLong();
			if(b-a<=t){
				count+=b-a;
			}else{
				count+=t;
			}
			a=b;
		}
		count+=t;
		System.out.println(count);
	}
}