import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			String S = scan.next();
			char[] c = new char[S.length()];
			int[] s = new int[S.length()];
			StringBuffer sb = new StringBuffer();
			StringBuffer sc = new StringBuffer();
			
			sb.append(S);
			c = S.toCharArray();
			
			int count = 0;
			int ok = 0;
			
			while(true) {
			
			
			
			boolean nozoketa = false;
	
			if(sb.length()<2) {
				break;
			}else {
				int k = sb.length();
	
			for(int i= 0;i<sb.length()-1;i++) {
				String A = sb.toString().substring(i, i+1);//一文字
				String B = sb.toString().substring(i+1, i+2);
				
				if(!A.equals("X")&&!B.equals("X")&&!A.equals(B)) {
					nozoketa =true;
					sb.replace(i, i+1, "X");
					sb.replace(i+1, i+2, "X");
					count++;
					count++;
				}
			}
			
			if(nozoketa==false)break;
			
			//System.out.println(sb.toString());
			
			for(int i = 0;i<sb.length();i++) {
				if(!sb.toString().substring(i, i+1).equals("X")) {
					sc.append(sb.toString().substring(i, i+1));
				}
			}
			
			//System.out.println(sc);
			sb.delete(0, k);
			sb.append(sc.toString());
			sc.delete(0, k);
			//System.out.println(sb);
			//System.out.println(nozoketa);
			}
			
			//}while(ok==0);
			}
			
			System.out.println(count);
			
		}	
	}
}
