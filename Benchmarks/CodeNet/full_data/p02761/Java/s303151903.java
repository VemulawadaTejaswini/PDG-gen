import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[3];Arrays.fill(a,-1);
		boolean f = false;
		for(int i=0;i<m;i++){
			int s = sc.nextInt()-1;
			int c = sc.nextInt();
			if((a[s]!=-1&&a[s]!=c)||(s==0&&c==0&&n!=1)){
				f = true;
			}else{
				a[s]=c;
			}
		}
		if(!f){
			for(int i=0;i<n;i++){
				if(a[i]==-1&&i==0&&m!=0){
					System.out.print(1);
				}else if(a[i]==-1){
					System.out.print(0);
				}else{
					System.out.print(a[i]);
				}
			}
			System.out.println();
		}else{
			System.out.println(-1);
		}
	}
}
