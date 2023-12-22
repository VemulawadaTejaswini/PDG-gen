import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] data = new int[N+1];
		int max = 0;
		int max2 = 0;
		boolean first = true;
		for(int i = 0 ; i<N; i++){
			int input = sc.nextInt();
			data[input]++;
			if(data[input]>=2){
				int temp = max;
				max = input;
				if(!first){
					if(temp != max) max2 = temp;
					else if(temp == max && data[input] >= 4){
						max2 = temp;
					}
				}
				first = false;
			}
		}
	//	System.out.println(max+"  "+max2);
		long res = max*max2;
		
		System.out.println(res);
	}
}
