import java.util.Scanner;

public class Main{

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
				long a = (S.charAt(b))-48;
				
				if (a==1) {
					digit++;
					if (digit>=K)
						break;
					b++;
				}
				else {
					break;
				}
			}
			System.out.println((S.charAt(b))-48);
			
		}
	}

}
