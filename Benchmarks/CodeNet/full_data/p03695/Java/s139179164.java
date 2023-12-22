import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		int[] col = new int[9];
		for(int i=0;i<N;i++){
			col[io.nextInt()/400] ++;
		}
		int min = 0;
		for(int i=0;i<8;i++){
			if(col[i]>0) min++;
		}
		
		int max;
		if(min == 0){
			min = 1;
			max = col[8];
		}else if(col[8]>0){
			max = min + col[8];
		}else{
			max = min;
		}
			
		System.out.println(min + " "+ max);
		
	}
}