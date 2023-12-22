import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++){
			h[i] = sc.nextInt();
		}
		int max = 0;
		for(int i = 0; i < n-1; i++){
			int count = 0;
			for(int j = i; j < n-1; j++){
				if(h[j+1] > h[j]){
					break;
				}else{
					count++;
				}
			}
			if(count > max)
				max = count;
		}
		System.out.println(max);
	}
	
	}