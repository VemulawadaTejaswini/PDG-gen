import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] d=new int[n];
		int dsize=n;
		for(int i=0;i<n;i++){
			d[i]=sc.nextInt();
		}
		Arrays.sort(d);
		int m=sc.nextInt();
		int[] t=new int[m];
		int tsize=m;
		boolean is=true;
		for(int i=0;i<m;i++){
			t[i]=sc.nextInt();
		}
		Arrays.sort(t);
		if(n<m){
			is=false;
		}
		for(int i=0;is&&i<m;i++){
			int buf=t[i];
			for(int j=0;j<n;j++){
				if(d[j]==buf){
					d[j]=-1;
					break;
				}
				if(d[j]>buf||j==n-1){
					is=false;
					break;
				}
			}
		}
		if(is){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}

