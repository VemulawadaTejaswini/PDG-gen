import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map data = new HashMap();
		int max = 0;
		int max2 = 0;
		for(int i = 0 ; i<N; i++){
			int input = sc.nextInt();
			if(data.containsKey(input)){
				int v = (int)data.get(input);
				data.replace(input, v, v+1);
				if(input > max){
					int temp = max;
					max = input;
					max2 = temp;
				}
				else if(input == max && (int)data.get(input) >=4 ){
					max2 = input;
				}
				else if(input > max2 && input!=max){
					max2 = input;
				}
			}
			else{
				data.put(input, 1);
			}
		}
	//	System.out.println(max+" "+max2);
		long res = max*max2;
		System.out.println(res);
		
	}
}
