import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		int ans=0;
		int tmp=0;

		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		
		for(int j=0;j<N;j++){
			tmp=A[j];
			for(int k=j+1;k<N;k++){
				tmp+=A[k];
				if(tmp==0) ans++;
			}
		}

		System.out.println(ans);
	}
}