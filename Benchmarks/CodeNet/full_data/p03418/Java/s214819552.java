import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int num=0;
		
		for(int b=K+1;b<=N;b++){
			for(int a=K;a<=N;a++){
				if(a%b>=K && a>0 && b>0) num++;
			}
		}

		System.out.println(num);

	}
}