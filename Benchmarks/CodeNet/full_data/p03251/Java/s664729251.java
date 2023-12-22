import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int max = -101;
		int min = 101;
		int flg = 0;
		for(int i=0;i<N;i++){
			int x = sc.nextInt();
			if(max < x){
				max = x;
			}
		}
                for(int j=0;j<M;j++){
			int y = sc.nextInt();
			if(min > y){
				min = y;
			}
		}
		for(int t= X+1;t<=Y;t++){
			if(max < t && t<= min){
				System.out.println("No War");
				flg=1;
				break;
			}
		}
		if(flg == 0){
		System.out.println("War");
		}
	}
}