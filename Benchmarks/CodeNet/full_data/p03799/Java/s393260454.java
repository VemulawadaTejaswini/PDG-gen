import java.util.*;
public class Main{
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N= sc.nextInt();
		long M=sc.nextInt();
		if(M<2l*N){
			System.out.println((long)(M/2l));
		}else{
			System.out.println((long)(N+(M-2l*N)/4l));
				
		}
	}
}