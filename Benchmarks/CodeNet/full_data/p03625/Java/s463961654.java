import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] data = new int[N];
		for(int i = 0 ; i<N; i++){
			data[i] = sc.nextInt();
		}
		Arrays.sort(data);
		long max = 0;
		long max2 = 0;
		for(int i = N-1; i>0; i--){
			if(data[i] == data[i-1]){
				if(max == 0){
					max = data[i];
					i--;
				}
				else{
					max2 = data[i];
					break;
				}
			}
		}
		long res = max*max2;
		System.out.println(res);
	}
}
