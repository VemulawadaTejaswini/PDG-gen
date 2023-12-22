

import java.util.Scanner;

public class newthignsa {

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=scan.nextInt();
		}
		int bit[][]=new int[n][20];
//		int 
		int x=5;
//		System.out.println(x&(1<<0));
//		System.out.println(x&(1<<2));
//		System.out.println(x&(1<<3));
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<20;j++)
			{
				if((ar[i]&(1<<j))>=1)
				{
					bit[i][j]=1;
				}
			}
		}
		
		long ans=0;
		int tem[]=new int[20];
		int right=0;
	for(int left=0;left<n;left++)
	{
		while(right<n) {
			
			boolean good=true;
			for(int i=0;i<20;i++){
				if((tem[i]==1) && (bit[right][i]==1))
				{
//					System.out.println("ok"+" "+left+" "+right);
					good=false;
//					System.out.println(good);
					break;
				}
			}
			if(good==false){
//				System.out.println("WTFFF");
				break;
				
			}
			else{
				for(int i=0;i<20;i++)
				{
					if(bit[right][i]==1)
					{
						tem[i]=1;
					}
				}
				right++;
			}
				
			}
				
				ans+=right-left;
				
				for(int i=0;i<20;i++)
				{
					if(bit[left][i]==1)
					{
						tem[i]=0;
					}
				}
//			System.out.println(left+" "+right);	
			}
			System.out.println(ans);
			
		}
	}

