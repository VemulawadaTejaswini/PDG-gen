import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int anss = 0;
		int j=1;
		int N = sc.nextInt();
		int X = sc.nextInt();
		//整数型配列の宣言と初期化
		int [] arys;
		arys = new int [N+1];
		
		for(int i=1; i<=N;i++)
		{		
		arys[i-1]=sc.nextInt();
		}
		for(j=1;sum<X&&j<=N;j++){
			sum=sum+arys[j-1];
		}
		
		if(j>N)
		{anss=N+1;
		}
		if(sum>X)
		{anss=j-1;
		}
		if(sum==X)
		{anss=j;
		}
		System.out.println(anss);
		}
}
