import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		
		HashSet<Integer> integers=new HashSet<Integer>();
		int i=0;
		for(i=0;integers.add(function(N));i++) {
			
		}
		System.out.println(i);
		sc.close();
	}
	
	public static Integer function(Integer N) {
		if(N%2==0) {
			N=N/2;
		}else {
			N=3*N+1;
		}
		return N;
	}
}