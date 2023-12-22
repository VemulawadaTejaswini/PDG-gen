import java.util.*;

class Main{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int min = 200000;
		int cnt = 0;
		
		for(int i =0; i<N; i++){
			int P = sc.nextInt();
			
			min = Math.min(min,P);
			
			if(min == P)
			cnt++;
		}
		System.out.println(cnt);
	}
}