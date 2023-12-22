import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		
		
		
		if (K==1)
			System.out.println((S.charAt(0))-48);
		
		else {
			long digit = 0;
			int b = 0;
			while (digit<K){
				int a = (S.charAt(b))-48;
				
				if (a==1) {
					digit++;
					b++;
				}
				else {
					digit+=a*(5*Math.pow(10, 15));
					b++;
				}
			}
			System.out.println((S.charAt(b-1))-48);
			
		}
			
		
	}

}
