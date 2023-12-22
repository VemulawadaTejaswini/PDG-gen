import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] kk=new boolean[n];
		for(int i = 0; i<n-1; i++){
			int u = sc.nextInt();
			int v = sc.nextInt();
			long w = sc.nextLong();
			if(w%2==0){
				kk[u-1]=true;
				kk[v-1]=true;
			}
		}
		for(int i=0; i<n; i++){
			if(kk[i]){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
	}
}
