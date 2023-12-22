import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String S = scan.next();
			int N = S.length();
			
			StringBuffer sb = new StringBuffer(S);
			StringBuffer sc = new StringBuffer(S);
			sc.reverse();
			//String SR =sc.toString();
			int count = 0;
			int countR = 0;
			
			if(N==1) {
				System.out.println(0);
			}else {
				
			
			for(int i = 1;i<N;i++) {
				String su = sb.substring(i-1, i);
				String sm = sb.substring(i, i+1);
				if(sm.equals(su)&&sm.equals("1")) {
					sb.replace(i, i+1, "0");
					count++;
					//System.out.println(sb);
				}else if(sm.equals(su)&&sm.equals("0")) {
					sb.replace(i, i+1, "1");
					count++;
					//System.out.println(sb);
				}
			}
			System.out.println();
				
			for(int i = 1;i<N;i++) {
				String su = sc.substring(i-1, i);
				String sm = sc.substring(i, i+1);
				if(sm.equals(su)&&sm.equals("1")) {
					sc.replace(i, i+1, "0");
					countR++;
					//System.out.println(sc);
				}else if(sm.equals(su)&&sm.equals("0")) {
					sc.replace(i, i+1, "1");
					countR++;
					//System.out.println(sc);
				}
			}
			
			System.out.println(count>countR?countR:count);
			
			
			}
			
			
		}
		
		
	}
		

}
