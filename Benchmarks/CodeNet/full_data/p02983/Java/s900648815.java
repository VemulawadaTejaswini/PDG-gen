import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		int ans = -1;
		for(int i=l;i<=r;i++)
		{
			if(i%2019==0)
			{
				ans = 0;
				System.out.println(ans);
				break;
			}
		}
		if(ans!=0)
		{
			System.out.println((l*(l+1))%2019);
		}
		sc.close();
	}

}
