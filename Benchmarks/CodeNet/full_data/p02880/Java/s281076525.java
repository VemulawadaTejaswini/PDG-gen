import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<10; i++){
			for(int j=1; j<10; j++){
				int sum=i*j;
				
				if(sum==n){
				System.out.println("Yes");
				return;
				}
			}
		}
		System.out.println("No");
	}
}