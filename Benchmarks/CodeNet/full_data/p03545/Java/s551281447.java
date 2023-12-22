import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long []A = new long[4];
		String S = sc.next();
		String ans;
		for(int i = 0; i<4;i++){
			A[i]=S.charAt(i)-'0';
		}
		
		
		for(int i = 0;i<(1<<3); i++){
			ans = "" + S.charAt(0);
			long sum = A[0];
			for(int j = 0;j<3;j++){
				if((1&i>>j)==1){
					sum += A[j+1];
					ans += "+" +S.charAt(j+1);
				}else{
					sum -= A[j+1];
					ans += "-" +S.charAt(j+1);
				}
				
			
			}
			if(sum == 7){
				System.out.println(ans + "=7");
				break;
			}
		}
	
	
	}


}




