import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			int m=sc.nextInt();
			ArrayList<Integer> queue=new ArrayList<>();
			ArrayList<Integer> sum=new ArrayList<>();
			int[][] a=new int[n+1][3];
			for(int i=0; i<n; i++) {
				a[i][0]=sc.nextInt();
				a[i][1]=sc.nextInt();
				a[i][2]=sc.nextInt();
			}
			int s=0;
			int ss=0;
			for(int i=0; i<(1<<3); i++) {
				ss=0;
				for(int num=0; num<n; num++) {
					s=0;
					for(int j=0; j<3; j++) {
						if((1 & i>>j)==1) s+=a[num][j];
						else s-=a[num][j];
					}
					queue.add(s);
				}
				Collections.sort(queue);
				Collections.reverse(queue);
				for(int k=0; k<m; k++) {
					ss+=queue.get(k);
				}
				queue.clear();
				sum.add(ss);
			}
			Collections.sort(sum);
			Collections.reverse(sum);
			System.out.println(sum.get(0));

		}
	}
}