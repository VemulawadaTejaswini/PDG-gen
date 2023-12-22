import java.util.Scanner;
import java.util.*;
/**
 * @author yamato
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static boolean kaibun(String S,int N) {
		int i;
		String s1;
		String s2;
		if(N%2 != 0) {
			 s1 = S.substring(0,(N-1)/2);
			 s2 = S.substring((N-1)/2+1);
		}else {
			 s1 = S.substring(0,(N)/2);
			 s2 = S.substring((N)/2);
		}
		
        StringBuffer str2 = new StringBuffer(s2);
        s2 = str2.reverse().toString();
        
        //System.out.println(s1);
        //System.out.println(s2);
        
		if(s1.equals(s2)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		int N = S.length();
		//System.out.println(kaibun(S,N));
		if (kaibun(S,N)) {
			String S2 = S.substring(0,(N-1)/2);
			int N2 = S2.length();
			
			if (kaibun(S2,N2)) {
				String S3 = S.substring((N+3)/2-1,N);
				int N3 = S3.length();
				
				if (kaibun(S3,N3)) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
				
			}else {
				System.out.println("No");
			}
			
			
		}else {
			System.out.println("No");
		}
	}

}
