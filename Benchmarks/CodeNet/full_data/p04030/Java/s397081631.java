import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			String S = sc.next();
			char[] s = S.toCharArray();
			List<Integer> a = new ArrayList<Integer>();
			
			for(int i=0;i<S.length();i++) {
				a.add(i);
			}
			
			for(int i=0;i<S.length()-1;i++) {
				if(i==0&&s[i]=='B') {
					a.remove(i);
				}
				if(s[i+1]=='B') {
					if(a.indexOf(i)!=-1) {
						a.remove(a.indexOf(i));
					}
					a.remove(a.indexOf(i+1));
				}
			}
			
			String nS = "";
			
			for(int i=0;i<S.length();i++) {
				if(a.contains(i)) {
					nS+=s[i];
				}
			}
			
			System.out.println(nS);
		}

	}
