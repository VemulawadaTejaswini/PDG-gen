import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		String S = stdin.next();
		String Sc[] = new String[S.length()+1];
		String sc1;
		String sc2;
		int cnt=0;
		
		for(int i=0;i<S.length();i++) {
			Sc[i] = S.substring(i,i+1);
		}
		
		for(int i=0,j=S.length()-1;j>=0;i++,j--) {
			sc1 = Sc[i];
			sc2 = Sc[j];
			if(!(sc1.equals(sc2))) {
				cnt++;
				Sc[i] = Sc[j];
			}
		}

		
		out.println(cnt);
		out.flush();
	}

}
