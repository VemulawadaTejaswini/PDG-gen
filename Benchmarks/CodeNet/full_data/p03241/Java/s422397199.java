import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if(M%2==0){
			for(int i=N; i<M; i++){
				if(M%i==0){
					System.out.println(M/i);
					return;
				}
			}
		}else{
			for(int i=(N%2==0?N+1:N); i<M; i+=2){
				if(M%i==0){
					System.out.println(M/i);
					return;
				}
			}
		}
		System.out.println(M);
		return;
	}
}