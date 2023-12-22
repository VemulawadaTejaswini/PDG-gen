import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] data = new int[N+1];
		int res = 0;
		for(int i = 1 ; i<=N; i++){
			data[i] = sc.nextInt();
		}
		
		int[]add = new int[N+1];
		int[] x = new int[N+1];
		for(int i = 1; i<=N; i++){
			add[i] = add[i-1]+data[i];
			x[i] = x[i-1]^data[i];
		}
		
		for(int l = 1 ; l<=N; l++){
			int xor = 0;
			int sum = 0;
			for(int r = l; r<=N; r++){
				sum = add[r]-add[l-1];
				xor = x[r]^x[l-1];
		/*		for(int k = l; k<=r; k++){
					if(k == l){
						xor=data[k];
						sum = data[k];
						continue;
					}
					xor = xor^data[k];
					sum+=data[k];
				}*/
				if(xor == sum){
					res++;
				}
			}
			
		}
		System.out.println(res);
	}
}
