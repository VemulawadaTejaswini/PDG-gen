import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int k=scanner.nextInt();
		for(int i=0;i<k;i++) {
			if(i%2==0) {
				b+=a/2;
				a-=Math.ceil((double)a/2);
				
			}else {
				a+=b/2;
				b-=Math.ceil((double)b/2);
				
			}
			
		}
		System.out.println(a+" "+b);
	}
}