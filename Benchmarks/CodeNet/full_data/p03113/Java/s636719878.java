import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt();
		int[][] a=new int[n][2];
		for(int i=0;i<n;i++){
			a[i][0]=i+1;
			a[i][1]=s.nextInt();
		}
		List<Integer> r=new ArrayList<>();

		int prev=-1;

		for(int q=0;q<k+1;q++){
			Arrays.sort(a,(x,y)->y[1]-x[1]);
			int t=0;
			for(int i=0;i<n;i++){
				if(a[i][0]!=prev){
					if(a[i][1]<=0){
						System.out.println(-1);
						return;
					}
					a[i][1]--;
					r.add(t=a[i][0]);
				}
			}
			prev=t;
		}
		System.out.println((n-1)*(k+1)+1);
		System.out.println(r.toString().replaceAll("[^0-9 ]",""));
	}
}