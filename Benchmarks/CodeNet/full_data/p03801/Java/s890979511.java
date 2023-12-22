import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = Integer.parseInt(sc.next());
			int[][] a = new int[N][2];
			for(int i=0;i<N;i++){
				a[i][0] = Integer.parseInt(sc.next());
				a[i][1] = i;
			}
			int[] countS=new int[N];
			for(int i=0;i<N;i++)countS[i]=0;
			
			Arrays.sort(a, new MComparator());
			int min=a[0][1];
			for(int i = 0;i<N;i++){
				int cnt=a[i][0]-((i<N-1)?a[i+1][0]:0);
				if(min<N)countS[min]+=(i+1)*cnt;
				if((i!=N-1)&&(min>a[i+1][1]))min=a[i+1][1];
			}
			for(int i=0;i<N;i++)System.out.println(countS[i]);
		}
	}
}
class MComparator implements Comparator<int[]>{
	public int compare(int[] a1, int a2[]){
		return a2[0]-a1[0];
	}
}