import java.util.*;
public class Main{
  	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int M = keyboard.nextInt();
				
		int[][]drink = new int[N][2];
		for(int i=0; i<N; i++){
			for(int j=0; j<2; j++){
				drink[i][j] = keyboard.nextInt();
			}
		}
		Arrays.sort(drink, (l,r) -> {return l[0]-r[0];});
		
		int buy = M;
		long money = 0;
		for(int k=0; k<N; k++) {
			buy -= drink[k][1];
			if(buy > 0) {
				money += (long)drink[k][0]*drink[k][1];	
			}else{
				money += (long)drink[k][0]*(drink[k][1]+buy);
				break;
			}
		}
		
		System.out.println(money);
		keyboard.close();	
	}
}
