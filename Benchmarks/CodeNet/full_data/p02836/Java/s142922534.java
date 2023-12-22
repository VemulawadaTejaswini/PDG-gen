	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			String a = sc.next();
			StringBuffer sb = new StringBuffer(a);
			String b = sb.reverse().toString();
			
			int count =0;
			
			for(int i =0;i<a.length();i++) {
				char c = a.charAt(i);
				char d = b.charAt(i);
				
				if(c != d) {
					count++;
				}
			}
			
			System.out.println(count);

		}
	}

