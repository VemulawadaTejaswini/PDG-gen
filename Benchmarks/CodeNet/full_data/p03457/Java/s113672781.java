import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] x = new int[n];
		int[] y = new int[n];
		boolean flag = true;
		int rtime = 0;
		int nx = 0;
		int ny = 0;
		for(int i = 0; i < n; i++){
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		for(int i = 0; i < n && flag; i++){
			int itime = t[i] - rtime;
			rtime = t[i];
			int wtime = Math.max(nx,x[i])-Math.min(nx,x[i])+Math.max(ny,y[i])-Math.min(ny,y[i]);
			if(itime < wtime){
				flag = false;
				break;
			}else if(itime > wtime){
				if((itime-wtime)%2==1){
					flag = false;
					break;
				}
			}
			ny = y[i];
			nx = x[i];
		}
		System.out.print(flag?"Yes":"No");
	}
}
