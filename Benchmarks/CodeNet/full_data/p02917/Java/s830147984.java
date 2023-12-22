import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] buff=new int[n];
		int sum=0;

		for(int i=0;i<n-1;i++) {
			buff[i]=sc.nextInt();
		}
		buff[n-1]=Integer.MAX_VALUE;
		for(int i=1;i<n;i++) {
			sum+=Math.min(buff[i-1],buff[i]);
			//System.out.println(sum);
		}
		System.out.println(sum+buff[0]);
	}
}

