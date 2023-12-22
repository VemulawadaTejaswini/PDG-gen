import java.util.*;

class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int C[][] = new int[3][3];
		
		int sum = 0;
		
		for(int i = 0 ; i < 3 ; i ++){
			for(int j = 0 ; j < 3 ; j ++){
				C[i][j] = sc.nextInt();
				sum = sum + C[i][j] ;
			}
		}
		
		boolean result = false;
		
//		System.out.println(sum);
		
		if(sum % 3 == 0){
			
			int D = sum / 3;
			if(D == C[0][0] + C[1][1] + C[2][2] &&
			   D == C[0][1] + C[1][2] + C[2][0] &&
			   D == C[0][2] + C[1][0] + C[2][1] &&
			   D == C[0][2] + C[1][1] + C[2][0] &&
			   D == C[0][1] + C[1][0] + C[2][2] &&
			   D == C[0][0] + C[1][2] + C[2][1] ){
			   	result = true;
			   }
		}
		
		System.out.println( result ? "Yes" : "No");
	}
}


