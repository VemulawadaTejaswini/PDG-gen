import java.util.*;
import java.math.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	/*static void sort(int[] A,int l,int r) {
		if(l=r) {
			
		}
		sort(A,0,(l+r)/2);
		sort(A,1+ (l+r)/2,r);
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//X+Y+Z=S   0<=X,Y,Z<=K

		int K=sc.nextInt();
		int S=sc.nextInt();
		int count=0;
		
		for(int i=0;i<=K;i++) {
			for(int j=0;j<=K;j++) {
				for(int l=0;l<=K;l++) {
					if(i+j+l==S) {
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
		
		
	}

}
