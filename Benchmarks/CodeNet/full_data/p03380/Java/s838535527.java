import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x[] = new int[N];

		for(int n=0;n<N;n++){
			int v = sc.nextInt();
			x[n] = v;
		}

		Arrays.sort(x);

		int max = x[N-1];
		float dist = 999999999;
		int t=-1;
		for(int n=0;n<N;n++){
			
			if(dist > Math.abs((float)max/2-x[n])){
				dist = Math.abs((float)max/2-x[n]);
				t = x[n];
			}
			if(x[n] > (float)max/2) break;
		}
		System.out.println(max+" "+t);
	}
}