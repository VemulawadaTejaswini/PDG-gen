import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 String [] s = new String [N];

		 for(int i=0;i<N;i++) {
			 s[i] = scan.next();
		 }
		 scan.close();
		 long c=0;

		 for(int i=0;i<N-1;i++) {
			 int [] alph = new int[26];
			 Arrays.fill(alph,0);
			 for(int j=0;j<s[i].length();j++) {
				 alph[s[i].charAt(j)-'a']++;
			 }
			 for(int j=i+1;j<N;j++) {
				 int [] alph2 = new int[26];
				 Arrays.fill(alph2,0);

				 for(int k=0;k<s[j].length();k++) {
					 alph2[s[j].charAt(k)-'a']++;
				 }
				 if(Arrays.equals(alph,alph2)) {
					  c++;
				  }
			 }
		 }
		 System.out.println(c);
	}

}