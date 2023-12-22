import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		
		int sum [] = new int [N+2];
		
		int j=0;
		int count=0;
		
		while (j<N){
			if (S.charAt(j)!='A'){
				sum [j+1]=count;
				j++;
			}
			else {
				sum [j+1]=count;
				if (j<N-1 && S.charAt(j+1) =='C'){
					count++;
					sum [j+2]=count;
					j++;
				}
				else {
					sum [j+2]=count;
					j++;
				}
			}
		}
		/*for (int i=1; i<N+1; i++){
			System.out.println("index= "+i+" , value = "+sum[i]);
		}*/
		
		
		for (int i=0; i<Q; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			System.out.println(sum[r]-sum[l]);
			
		}
		
		sc.close();
	}
}
