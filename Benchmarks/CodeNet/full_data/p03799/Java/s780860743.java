import java.util.*;
public class Main{
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N= sc.nextInt();
		long M=sc.nextInt();
		if(M<2l*N){
			long result=(M/2l);
			System.out.println(result);
		}else{
			long result=N+(M-2l*N)/4l;
			System.out.println(result);
				
		}
	}
}