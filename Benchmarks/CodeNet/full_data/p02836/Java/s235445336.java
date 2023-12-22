	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			String a = sc.next();
			StringBuffer sb = new StringBuffer(a);
			String b = sb.reverse().toString();

			int count =0;

			for(int i =0;i<a.length()/2;i++) {

				if(a.substring(i,i+1) != a.substring(a.length()-1-i,a.length()-i )) {
					count++;
				}
			}

			System.out.println(count);

		}
	}

