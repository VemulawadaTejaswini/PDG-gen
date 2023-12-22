import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++){
			h[i] = sc.nextInt();
		}
		int max = h[n-1];
		boolean flag = true;
		for(int i = n-2; i >= 0; i--){
			if(h[i] > max){
				if(h[i]-1 > max){
					flag = false;
					break;
				}
			}else if(h[i] < max){
				max = h[i];
			}
		}
		System.out.print(flag?"Yes":"No");
	}
}
