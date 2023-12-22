import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] low = new int[n];
		
		for(int i = 0; i < n; i++){
			int input = sc.nextInt();
			low[i] = input;
		}
		
		
		int j = 0;
		int count = 0;
		for(j = 1; j < low.length; j++){
			if(j+1 >= low.length){
				break;
			}
			if(low[j-1] < low[j] && low[j] < low[j+1]){
				count++;
			}
			else if(low[j+1] < low[j] && low[j] < low[j-1]){
				count++;
			}
		}
		System.out.println(count);
	}
}