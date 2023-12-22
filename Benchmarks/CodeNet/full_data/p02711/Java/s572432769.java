import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int flag=0;
		while(x!=0)
		{
			int rem=x%10;
			if(rem==7)
			{
				flag=1;
				break;
			}
			x=x/10;
				
		}
		if(flag==1)
			System.out.println("Yes");
		else
			System.out.println("No");
		input.close();
	}
	

}
