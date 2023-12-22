import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			String s = sc.next();
			
			String[] a = new String[s.length()];
			
			for(int i =0;i<s.length();i++) {
				a[i]=String.valueOf(s.charAt(i));
				
			}
			
						
			int res = 0;
			int i = 0;
			
			for(;i<s.length()-1;) {
				
				if(a[i].equals("B")&&a[i+1].equals("W")) {
					a[i]="W";
					a[i+1]="B";
					i = 0;
					res++;

					continue;
				}
				i++;
			}
			
			System.out.println(res);
			
		}

	}