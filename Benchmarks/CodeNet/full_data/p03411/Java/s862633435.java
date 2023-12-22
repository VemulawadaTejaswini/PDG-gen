import java.util.*;
 
public class Main{
	public static boolean[][] map = new boolean[100][100]; //[red][blue]
	public static int[] blues = new int[100];
	public static int[] reds = new int[100];
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		int[] d = new int[N];
		for(int i=0;i<N;++i){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i=0;i<N;++i){
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		for(int i=0;i<N;++i){
			for(int j=0;j<N;++j){
				if(a[i]<c[j]&&b[i]<d[j]){
					map[i][j] = true;
					blues[i]++;
					reds[j]++;
				}
			}
		}
		
		int ans = 0;
		while(!noPair(N)){
			int red = biggest(N);
			int blue = -1;
			int temp = Integer.MAX_VALUE;
			for(int i=0;i<N;++i){
				if(map[red][i]&&reds[i]<temp){
					blue = i;
					temp = reds[i];
				}
			}
			
			delete(red,blue,N);
			ans++;
		}
		
		System.out.println(ans);
		return;
	}
	
	public static boolean noPair(int n){
		for(int i=0;i<n;++i){
			if(reds[i]!=0) return false;
 		}
		return true;
	}
	
	public static int biggest(int n){
		int max = Integer.MAX_VALUE;
		int ret = -1;
		for(int i=0;i<n;++i){
			if(blues[i]!=0&&blues[i]<max){
				max = blues[i];
				ret = i;
			}
		}
		return ret;
	}
	
	public static void delete(int r,int b,int n){
		for(int i=0;i<n;i++){
			if(map[r][i]){
				map[r][i] = false;
				blues[r]--;
				reds[i]--;
			}
			if(map[i][b]){
				map[i][b] = false;
				blues[i]--;
				reds[b]--;
			}
		}
	}
}