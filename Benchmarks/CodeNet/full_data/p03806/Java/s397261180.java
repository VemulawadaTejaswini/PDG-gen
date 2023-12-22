import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int Ma = Integer.parseInt(sc.next());
		int Mb = Integer.parseInt(sc.next());
		int[][] abc = new int[3][N];
		int MaxCost = 100*N+1;
		int MaxWeight =Math.max(Ma, Mb)*N+1;
		int budget = MaxCost;
		for(int i=0;i<N;i++){	//データの受け取り
			for(int kind=0;kind<3;kind++) abc[kind][i] = Integer.parseInt(sc.next());
		}
		
		int[][][] DynPlan = new int[N][MaxWeight][MaxWeight];//i番目まででの最小コスト
		for(int Num=0;Num<N;Num++)for(int a=0;a<MaxWeight;a++)for(int b=0;b<MaxWeight;b++)DynPlan[Num][a][b]=MaxCost;
		
		DynPlan[0][0][0]=0;//最小コストの設定
		for(int Num=1;Num<N;Num++){
			for(int a=0;a<MaxWeight;a++){
				for(int b=0;b<MaxWeight;b++){
					DynPlan[Num][a][b]=Math.min(DynPlan[Num][a][b],DynPlan[(Num-1)][a][b]);
					if(Math.max(a+abc[0][Num], b+abc[1][Num])<MaxWeight) DynPlan[Num][a+abc[0][Num]][b+abc[1][Num]]=Math.min(DynPlan[Num][a+abc[0][Num]][b+abc[1][Num]],abc[2][Num]+DynPlan[(Num-1)][a][b]);
				}
			}
		}

		for(int c=1;c*Math.max(Ma, Mb)<MaxWeight;c++){//最小コストの計算
			budget=Math.min(budget,DynPlan[N-1][c*Ma][c*Mb]);
		}
		if(budget==MaxCost)budget=-1;
		System.out.println(budget);
		
		sc.close();
	}
	public static int calc(){
		int calc=0;
		return calc;
	}
}