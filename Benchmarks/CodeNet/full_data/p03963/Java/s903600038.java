import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();	//個数
		int k=sc.nextInt();	//ペンキの種類

		int num=k;	//塗り方の個数

		for(int i=0;i<n-1;i++) num*=(k-1);

		//答えを出力
		System.out.println(num);
	}
} 