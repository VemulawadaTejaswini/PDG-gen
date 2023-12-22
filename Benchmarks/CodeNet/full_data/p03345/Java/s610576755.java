//atcorder
//grand Q1
//N以下の整数で各桁の総和がA以上B以下のものの総和

import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		long num[] = new long[4];

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++) num[i] = sc.nextInt();
		
		for(int i=0;i<(int)num[3];i++)
		{
			long temp[] = new long[3];
			temp[0] = num[1]+num[2];
			temp[1]= num[0]+num[2];
			temp[2] = num[0]+num[1];
			
			for(int k=0;k<3;k++)num[k]=temp[k];
			
			//for(long n:num)System.out.println(n);
		}
		
		long ans = num[0] - num[1];
		long ten = 10*10*10*10*10*10*10*10*10*10*10;;
		//System.out.println(ten);
		if(ans>ten || ans < -ten)System.out.println("Unfair");
		else System.out.println(ans);
	}
}


