import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[] A = new int[N];
			
			int count =0;
			
			
			for(int i=0;i<N;i++) {//拡張for文は指示できるものと：格納したもの達
				A[i] = scan.nextInt();
			}
			
			Arrays.sort(A);
			
			StringBuffer sb = new StringBuffer();
			
			for(int i = 0;i<N;i++) {
				sb.append(String.valueOf(A[i]));
			}
			
			int start =0;
			int fin =0;
						
			for(int i = 0;i<N-1;i++) {
				
				if(A[i]!=A[i+1]) {
					fin = i+1;
					String sub = sb.toString().substring(start, fin);
					
					if(sub.length()%2==1) {
						count+=1;
					}
					start = i+1;
					
					if(i==N-2) {
						count+=1;
					}
					
				}
				
				
				
				
			}
			
			
			System.out.println(count);
						
		}
		
	}

}
