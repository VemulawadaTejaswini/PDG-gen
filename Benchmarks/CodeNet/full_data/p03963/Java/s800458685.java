import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int  N=  sc.nextInt();
		int  K=  sc.nextInt();
		
		int ans = K * (K -1);
		int anw = K * (K -1);
		if(K == 1)
		{
			System.out.println(K);
		}else if(K == 2)
		{
			System.out.println(ans);
		}else
		{
			for(int i = 2; i < N; i++)
			{
				anw =  anw * (K - 1);
			}
			System.out.println(anw);
		}
		
	}

}
