import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	//	int[] data = new int[N+1];
		Map data2 = new TreeMap();
		int max = 0;
		int max2 = 0;
		boolean first = true;
		for(int i = 0 ; i<N; i++){
			int input = sc.nextInt();
			if(data2.containsKey(input)){
				int v = (int)data2.get(input);
				data2.replace(input, v, v+1);
			}
			else{
				data2.put(input, 1);
			}
			if((int)data2.get(input) >= 2){
				int temp = max;
				max = input;
				if(!first){
					if(temp != max) max2 = temp;
					else if(temp == max && (int)data2.get(input) >= 4){
						max2 = temp;
					}
				}
				first = false;
			}
			
		/*	if(data[input]>=2){
				int temp = max;
				max = input;
				if(!first){
					if(temp != max) max2 = temp;
					else if(temp == max && data[input] >= 4){
						max2 = temp;
					}
				}
				first = false;
			}*/
		}
	//	System.out.println(max+"  "+max2);
		long res = max*max2;
		
		System.out.println(res);
	}
}
