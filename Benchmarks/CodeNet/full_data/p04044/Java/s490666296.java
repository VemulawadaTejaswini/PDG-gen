import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		String str[]=new String[l];
		String all;

		for(int i=0;i<n;i++)
		{
			//文字列読み取り
			str[i]=sc.next();
		}

		Arrays.sort(str);
		for (int i=0;i<n;i++) {
			System.out.print(str[i]);
		}
		System.out.println();
	}
} 