import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			String s = sc.next();

			String[] a = new String[s.length()];

			for(int i =0;i<s.length();i++) {
				a[i]=String.valueOf(s.charAt(i));

			}
			
			long n = 0;
			
			for(int i=0;i<s.length();i++) {
				if(a[i].equals(">")){
					n++;
				}
			}
			
			long res =n*(n+1)/2;

			System.out.println(res);

		}

	}