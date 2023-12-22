import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[] zero = new int[C];
		int[] one = new int[C];
		int[] two = new int[C];
		int[][] iwakan = new int[C][C];
		for(int i=0;i<C;++i){
			for(int j=0;j<C;++j){
				iwakan[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<N;++i){
			for(int j=0;j<N;++j){
				if((i+j)%3==0) zero[sc.nextInt()-1]++;
				else if((i+j)%3==1) one[sc.nextInt()-1]++;
				else two[sc.nextInt()-1]++;
			}
		}
		
		long ans = Long.MAX_VALUE;
		for(int z=0;z<C;++z){
			for(int o=0;o<C;++o){
				for(int t=0;t<C;++t){
					if(z!=o&&o!=t&&t!=z){
						long temp = 0;
						for(int i=0;i<C;++i) temp += zero[i] * iwakan[i][z];
						for(int i=0;i<C;++i) temp += one[i] * iwakan[i][o];
						for(int i=0;i<C;++i) temp += two[i] * iwakan[i][t];
						if(temp<=ans) ans = temp;
					}
				}
			}
		}
		System.out.println(ans);
		return;
	}
}