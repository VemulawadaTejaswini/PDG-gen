import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Long a = scan.nextLong();
		Long b = scan.nextLong();
		Long c = scan.nextLong();
		String result = "No";
		Long ca = (long) 0;
		Long cb = (long) 0;
		Long cc = (long) 0;


		for(Long i=(long) 1;a>i;i+=2) {
			a -= i;
			ca++;
		}
		for(Long i=(long) 1;b>i;i+=2) {
			b -= i;
			cb++;
		}
		for(Long i=(long) 1;c>i;i+=2) {
			c -= i;
			cc++;
		}

		if(ca+cb<cc) {
			result="Yes";
		}

		System.out.println(result);

	}
}