import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String S=sc.next();
		int K=sc.nextInt();
		String[] S2 = S.split("");
		char A=S.charAt(K-1);
		String A2 = String.valueOf(A);
		for(int i=0;i<N;i++){
			if(S2[i].equals(A2)){
			}else {
				S2[i]="*";
			}
		}
		
		for(int i=0;i<N;i++){
		    System.out.print(S2[i]);
		}
		
		
        
	}

}

