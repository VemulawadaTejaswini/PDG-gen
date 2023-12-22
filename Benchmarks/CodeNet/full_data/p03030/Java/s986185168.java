import java.util.Arrays;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Solve s= new Solve();
		s.solve();

	}
}


class Solve{


	 public void solve() {
		 Scanner sc = new Scanner(System.in) ;
		 int N = sc.nextInt();

		 String[] S = new String[N];
		 String[] s = new String[N];
		 int[] p = new int[N];
		 int[] P = new int[N];
		 int sub;
		 int[] res = new int[N];
		
		 for(int i = 0;i<N;i++) {
			 s[i]=sc.next();
			 p[i]=sc.nextInt();
			 S[i]=s[i];
		 }
		 	
		 
		 Arrays.sort(s);
		 
		 for(int i = 0;i<N;i++) {
			 for(int j=0;j<N;j++) {
				 if(s[i].equals(S[j])) {
					 P[i]=p[j];
					 S[j]="";
					 j=N;
				 }
			 }
			 
		 }
		 

		 for(int i = 0;i<N;i++) {
			//Arrays.fill(P,-1);
			
			for(int j = 0;j<N-1;j++) {
				if(s[j].equals(s[j+1])) {
					if(P[j]<P[j+1]) {
						sub=P[j];
						P[j]=P[j+1];
						P[j+1]=sub;
						
					}
				}
			}
			
		 }		     
		 for(int i = 0;i<N;i++) {
			 
			 for(int j =0;j<N;j++) {
				 if(P[i]==p[j]) {
					 res[i]=j+1;
				 }
			 }
			 System.out.println(res[i]);
		 }


		 }
}