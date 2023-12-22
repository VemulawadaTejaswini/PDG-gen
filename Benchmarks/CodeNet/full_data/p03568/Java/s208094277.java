import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double all = Math.pow(3, N);
		int count = 1;
		for(int i=0; i<N; i++){
			int A = sc.nextInt();
			if(A%2==0){
				count *=2;
			}
		}
		System.out.println((int)all-count);
    }
}
