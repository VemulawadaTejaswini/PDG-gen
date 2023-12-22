import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		int[] wins = new int[n-1];
		int winOne = 0;

		for(int i=0; i<n-1; i++){
			temp = sc.nextInt();
			if( temp == 1 ){
				winOne++;
			}else{
			wins[ temp-2 ]++;
			}
		}

		Arrays.sort(wins);
		System.out.println( Math.max( wins[n-2]+1 , winOne ));
		return;
	}
}