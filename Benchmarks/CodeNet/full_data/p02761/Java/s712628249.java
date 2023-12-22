import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];Arrays.fill(a,-1);
		boolean f = false;
		for(int i=0;i<m;i++){
			int s = sc.nextInt()-1;
			int c = sc.nextInt();
			if(a[s]==-1||a[s]==c){
				a[s]=c;
			}else{
				f=true;
			}
		}

		if(a[0]==0&&n>1)f=true;

		if(m==0)a[0]=0;

		if(!f){
			for(int i:a){
				int an = i == -1 ? 0 : i;
				System.out.print(an);
			}
			System.out.println();
		}else{
			System.out.println(-1);
		}
	}
}
