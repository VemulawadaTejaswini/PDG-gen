import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		for(int i=N; i<M; i++){
			if(M%i==0){
				System.out.println(M/i);
				return;
			}
		}
		System.out.println("1");
		return;
	}
}