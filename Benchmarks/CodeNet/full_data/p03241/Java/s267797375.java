import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		for(int i=N, l=M; i<l; i++){
			if(M%i==0){
				System.out.println(M/i);
				return;
			}
		}
	}
}