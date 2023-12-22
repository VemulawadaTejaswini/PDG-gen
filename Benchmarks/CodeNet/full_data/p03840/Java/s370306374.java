import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int[] a;
		a = new int[7];
		for(int i=0;i<7;i++){
			a[i]  = Integer.parseInt(as.next());
		}
		int n = 0;
		/*if(a[2]+a[5]+a[6]>0){
			n = 0;
		}else */if(Math.abs(a[3]-a[4])%2==0&&a[0]>=Math.min(a[3], a[4])
				&&(a[0]-Math.min(a[3], a[4]))%2==0){
			n += a[1] + (a[0]-Math.min(a[3], a[4])) + Math.min(a[3], a[4])*3
					+ Math.abs(a[3]-a[4]);
		}else if(Math.abs(a[3]-a[4])%2==1&&a[0]>=Math.min(a[3], a[4])
				&&(a[0]-Math.min(a[3], a[4]))%2==0){
			n += a[1] + (a[0]-Math.min(a[3], a[4])) + Math.min(a[3], a[4])*3
					+ Math.abs(a[3]-a[4])-1;
		}else if(Math.abs(a[3]-a[4])%2==0&&a[0]>=Math.min(a[3], a[4])
				&&(a[0]-Math.min(a[3], a[4]))%2==1){
			n += a[1] + a[0]-Math.min(a[3], a[4])-1 + Math.min(a[3], a[4])*3
					+ Math.abs(a[3]-a[4]);
		}else if(Math.abs(a[3]-a[4])%2==1&&a[0]>=Math.min(a[3], a[4])
				&&(a[0]-Math.min(a[3], a[4]))%2==1){
			n += a[1] + a[0]-Math.min(a[3], a[4])-1 + Math.min(a[3], a[4])*3
					+ Math.abs(a[3]-a[4])-1;
		}
		System.out.println(n);
	}
}