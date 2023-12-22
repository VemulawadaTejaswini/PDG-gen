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
		
		for(int l = 1 ; l<=N; l++){
			int xor = 0;
			int sum = 0;
			for(int r = l; r<=N; r++){
				for(int k = l; k<=r; k++){
					if(k == l){
						xor=data[k];
						sum = data[k];
						continue;
					}
					xor = xor^data[k];
					sum+=data[k];
				}
		//		System.out.println("[" + l+", "+r+" ] "+xor+"   "+sum);
				if(xor == sum){
					res++;
		//			System.out.println("↑ｇｅｔ");
				}
			}
			
		}
	//	System.out.println();
		System.out.println(res);
	}
}
