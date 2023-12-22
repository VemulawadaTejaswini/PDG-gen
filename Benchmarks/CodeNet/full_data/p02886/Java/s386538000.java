import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int[] d = new int[N];
		int sum=0;
		
		for(int i=0;i<d.length;i++) {
			d[i]=sc.nextInt();
		}
		
		for(int i=0;i<(d.length-1);i++) {
			for(int j=i+1;j<d.length;j++) {
				sum+=d[i]*d[j];
			}
		}
		
		System.out.println(sum);
		
	}
}
