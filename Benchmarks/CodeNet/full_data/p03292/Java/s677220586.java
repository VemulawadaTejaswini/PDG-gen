
import java.util.*;
class Main {

	
	
		public static void main(String[] args) {
			Scanner Cf=new Scanner(System.in);
				
				int[] A=new int[3];
				 A[0]=Cf.nextInt();
				 A[1]=Cf.nextInt();
				 A[2]=Cf.nextInt();
				
				
				
				Solver(A);
				Cf.close();
			}
		
		
		public static void Solver(int[] A) {
		
			Arrays.sort(A);
			int diff=0;
			for(int i=1;i<A.length;i++) {
				diff=Math.abs(A[i]-A[i-1])+diff;
			}
			System.out.println(diff);
		}
	

	}
