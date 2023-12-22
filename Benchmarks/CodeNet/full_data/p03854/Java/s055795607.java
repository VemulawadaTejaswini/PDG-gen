	import java.util.*;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String S = sc.next();
			S.replaceAll("dreamer", "-");
			S.replaceAll("eraser", "-");
			S.replaceAll("dream", "-");
			S.replaceAll("erase", "-");
			S.replaceAll("-", "");
			if (S.length() == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
			sc.close();
			
		}
		
		
	}