import java.util.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		int Alice=0;
		int Bob=0;
		int ans=0;

		for(int i=0;i<N;i++) A[i]=sc.nextInt();
		Arrays.sort(A); 

		for(int i=0;i<N;i++){
			if(i%2==0) Alice+=A[i];
			else Bob+=A[i];
		}

		if(Alice>Bob) ans=Alice-Bob;
		else ans=Bob-Alice;

		System.out.println(ans);
	}
}