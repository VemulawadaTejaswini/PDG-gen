import java.util.ArrayList;
import java.util.Scanner;

public class C_147 {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A = new int[N];
			
			ArrayList<ArrayList<Integer>>XA = new ArrayList<ArrayList<Integer>>();
			ArrayList<ArrayList<Integer>>YA = new ArrayList<ArrayList<Integer>>();
			
			
			/*for(int i = 1;i<=N;i++) {
				A[i-1] = scan.nextInt();
				ArrayList<Integer> xa = new ArrayList<Integer>();
				ArrayList<Integer> ya = new ArrayList<Integer>();
				for(int j = 1;j<=A[i-1];j++) {
					xa.add(scan.nextInt());
					ya.add(scan.nextInt());
				}
				
				XA.add(xa);
				YA.add(ya);
			}*/
			
			char [][] shougen = new char[(int)Math.pow(2,N)][N];//'0'or'1'
			
			
			
			
			for (int i=0; i<(Math.pow(2,N)); i++) {
				StringBuffer sb = new StringBuffer();
				
				for (int j=0; j<N; j++) {
					if ((1&i>>j) == 1) { sb.append("1");}
					if ((1&i>>j) == 0) { sb.append("0");}
				}
				shougen[i] =sb.toString().toCharArray();//N人が正直者か嘘かの組み合わせ
				
				//System.out.println(sb.toString());
			}
			
			
			for (int k=0; k<(Math.pow(2,N)); k++) {
				
			}
			
			for(int i = 1;i<=N;i++) {
				for(int j = 1;j<=A[i-1];j++) {
					XA.get(i).get(j);
				}
				
			}
			
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}
