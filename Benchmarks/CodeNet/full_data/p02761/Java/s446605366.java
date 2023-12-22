import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		int count=0;
		int x=0;
		int[] s=new int[M];
		
		for(int i=0;i<M;i++) {
			s[i]=0;
		}
		
		for(int i=0;i<M;i++) {
			x=sc.nextInt();
			if(s[x-1]==0){
				s[x-1]=sc.nextInt();
			}
			else {
				int k=sc.nextInt();
				if(s[x-1]!=k) {
					count++;
				}
			}
		}
		if(s[0]==0) {
			count++;
		}
		if(count==0) {
			for(int i=0;i<M;i++) {
				System.out.print(s[i]);
			}
		}
		else {
			System.out.print(-1);
		}
		
		
		sc.close();
	}
}
