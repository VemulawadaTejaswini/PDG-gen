import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int An[] = new int[N];
		for(int i = 0;i < N;i++){//値取得
			An[i] = sc.nextInt();
		}

		System.out.println(solve(N,An));

	}
	
	private static int solve(int N,int[] An){
       		ArrayList<Integer> an = new ArrayList<>();
		for(int a : An){
		an.add(a);
		}
		//Sorting
     		Collections.sort(an);

			//aの最大は配列の0番目と偶数番目の数を全て足したもの
			int amax = 0;
			for(int i = 0;i < an.size();i = i + 2){
			amax = amax + an.get(i); 
			}
			
			//bの最大
			int bmax = 0;
			for(int i = 1;i <  an.size();i = i + 2){
				bmax = bmax + an.get(i); 
			}
		int subtraction =  amax - bmax;
			if(subtraction > 0){
			return subtraction;
			}else if(subtraction < 0){
			return -subtraction;
			}
			return 0;


	}


}
