import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x[] = new int[N];

		int max = 0;
		for(int n=0;n<N;n++){
			int v = sc.nextInt();
			x[n] = v;
			if(max<v) max = v;
		}

		int st = 1;
		int nearhalf = x[0];
		float dist = Math.abs((float)max/2-x[0]);

		if(nearhalf == max){
			nearhalf = x[1];
			dist = Math.abs((float)max/2-x[1]);
			st = 2;
		}
		for(int n=st;n<N;n++){
			float d = Math.abs((float)max/2-x[n]);
			if(d < dist){
				nearhalf = x[n];
				dist = d;
			}
		}
		System.out.println(max+" "+nearhalf);
	}
}