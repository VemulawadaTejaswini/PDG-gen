import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();//年の数
		int M = scan.nextInt();
		
		int[] kazuN = new int[N];//都市ごとの本数
		
		
		int[] a = new int [M];
		int[] b = new int [M];
		
		for(int i = 0;i<M;i++){
			
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			
		}
		
		
		for(int i = 0;i<M;i++){
			for(int j = 1;j<=N;j++){
				
				if(j==a[i]){
					kazuN[j-1]+=1;
				}
				if(j==b[i]){
					kazuN[j-1]+=1;
				}
			
				
			}
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		for(int i = 0;i<N;i++){//入力したん個の都市ぶん出力
			System.out.println(kazuN[i]);	
		}
		
	}

}
