import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int[] A = new int[N];
	  int[] B = new int[N];
	  int[] C = new int[N];
	  int count = 0;
	  for(int i=0; i<N; i++) {
		  A[i] = sc.nextInt();
	  }
	  for(int i=0; i<N; i++) {
		  B[i] = sc.nextInt();
	  }  
	  for(int i=0; i<N; i++) {
		  C[i] = sc.nextInt();
	  }  
	  //昇順にソート
	  Arrays.sort(A);
	  Arrays.sort(B);
	  Arrays.sort(C);
	  
	  for(int j=0; j<N; j++) {
		  int x = meguruSearch(B[j], A,true);
		  int y = N - meguruSearch(B[j], C,false);
		  count += x*y;
	  }
	  out.println(count);	  
  }
  	//ある条件を満たす最小の要素を返す二分探索
	public static int meguruSearch(int n, int[] list,boolean isA) {
		int left = -1;
		int right = list.length;
		
		while (right - left > 1) {
			int mid = left + (right - left) / 2;
			if(isA) {
				if(isOKofA(mid, n,list)) right = mid;
				else left = mid;
			}
			else  {
				if(isOKofC(mid,n,list))right = mid;
				else left = mid;
			}
		}		
		return right;		
	}
	//条件：list[index]>=nを満たす最小の座標。その座標未満の座標が条件を満たす
	public static boolean isOKofA(int index, int n, int[] list) {
		if( list[index] >= n) return true;
		else return false;
	}
	//条件：list[index]>nを満たす最小の座標。その座標以上の座標が条件を満たす
	public static boolean isOKofC(int index, int n, int[] list) {
		if( list[index]>  n) return true;
		else return false;
	}
	
}