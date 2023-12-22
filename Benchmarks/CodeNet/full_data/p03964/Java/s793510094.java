import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.err.println("starts...");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			t[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		long tN = 1;//真の得票数を記録。
		long aN = 1;
		for(int i = 0; i < n; i++){
			if(t[i] <= a[i]){
				while(tN % t[i] != 0){
					tN++;
				}
				long temp = tN * a[i] / t[i];
				while(temp < aN){
					temp = temp + a[i];
				}
				aN = temp;
				tN = aN * t[i] / a[i];
			}else{
				while(aN % a[i] != 0){
					aN++;
				}
				long temp = aN * t[i] / a[i];
				while(temp < tN){
					temp = temp + t[i];
				}
				tN = temp;
				aN = tN * a[i] / t[i];
			}
		}
		System.out.print((aN + tN)+"\n");
	}

}
