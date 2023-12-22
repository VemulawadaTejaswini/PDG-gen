import java.util.Scanner;

public class Main {
		public static void testArr(int[][] a)
		{
			int a1=0;
			int a2=0;
			int a3=0;
			int b1=0;
			int b2=0;
			int b3=0;
			for(int i=0;i<=a[0][0];i++)
			{
				for(int j=0;j<=a[1][1];j++)
				{
					for(int k=0;k<=a[2][2];k++)
					{
						a1=i;
						b1=a[0][0]-i;
						a2=j;
						b2=a[1][1]-j;
						a3=k;
						b3=a[2][2]-k;
						
						if(a1+b1==a[0][0]&&a1+b2==a[0][1]&&a1+b3==a[0][2]&&
								a2+b1==a[1][0]&&a2+b2==a[1][1]&&a2+b3==a[1][2]&&
									a3+b1==a[2][0]&&a3+b2==a[2][1]&&a3+b3==a[2][2])
						{
							System.out.println("Yes");
							return;
						}
					}
				}
			}
			System.out.println("No");
			return;
		}
		
		public static void main(String[] args){
			
			Scanner s = new Scanner(System.in);
			int[][] a = new int[3][3];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[i][j]=s.nextInt();
				}
			}
			testArr(a);
			
			s.close();
		}		
}