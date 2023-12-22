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
		 int M = sc.nextInt();
		 int[] L = new int[M];
		 int[] R = new int[M];
		 int res = 0;
		 int l = 0;
		 int r = 1000000;
		 for(int i = 0;i<M;i++) {
			 L[i] = sc.nextInt(); 
			 R[i] = sc.nextInt(); 
			 if(L[i]>l) {
				 l=L[i];
			 }
			 if(R[i]<r) {
				 r=R[i];
			 }
		 }
		 System.out.println(r-l+1);
		 
		 
		 
		 
		 /*
		 for(int i = 1;i<=N;i++) {
			// System.out.println(i);
			 for(int j = 0;j<M;j++) {
				 if(i<L[j]||i>R[j]) {
					 j=M;
					 break;
				 }else if(j==M-1) {
					 if(i>=L[j]||i<=R[j]) {
						 res++;
						// System.out.println(res + "res"+i);
					 }
				 }
			 }
		 }
		 System.out.println(res);*/
		 
		 
		




		 }
}