import java.util.*;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int counter=1;
		int N= sc.nextInt();
		while (N<1||N>100)
			N=sc.nextInt();
		int a= sc.nextInt();
		while(a>N)
			a=sc.nextInt();
		if (N%2==0){
			for (int i=2; i<=N;i+=2)
				counter++;
		}
		else{
			for(int i=1; i<=N; i+=2)
			 	counter++;
		}
		System.out.println(counter/N);
	}
}