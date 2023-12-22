import java.util.Scanner;

public class Main {
	public static int co = 0;
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int d = scan.nextInt();
	
		int num[] = new int[m];
		array(num,n,m,0,d);
		System.out.println(count / co);
		scan.close();
	
	}
	
	public static Object array(int[] num,int n,int m,int s,int d) {
		if(s == m) {
			co++;
			for(int k = 0;k < m-1;k++) {
				if(Math.abs(num[k+1] - num[k]) == d) {
					count++;
				}
			}
		}else {
			for(int i = 0;i < n;i++) {
				num[s] = i+1;
				array(num,n,m,s+1,d);
			}
		}
		
		return null;
	}
}