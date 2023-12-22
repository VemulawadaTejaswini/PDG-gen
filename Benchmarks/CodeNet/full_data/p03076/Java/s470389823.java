import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int max=0;
		int a=0;
		int[] A = new int[5];
		int c=0;
		
		for(int i=0;i<5;i++) {
			A[i]=sc.nextInt();
			if(A[i]%10!=0) {
				max=Math.max((10-A[i]%10), max);
				c=i;
				}	
		}
		
		for(int i=0;i<5;i++) {
			count+=A[i];
			for(int j=0;j<9;j++) {
				if(count%10!=0) {
					count++;
				}
			}
		}
		
		System.out.println(count-max);
		
		sc.close();
	}
}
