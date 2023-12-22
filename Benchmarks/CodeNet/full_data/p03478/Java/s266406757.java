import java.util.Scanner;

 public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int s=0;
	    for(int i=1;i<=a;i++)
	    {
	    	int sum=0;
	    	while(i!=0)
	    	{
	    		sum+=i%10;
	    		i=i/10;
	    	}
	    	if(sum<=c&&sum>=b) {
	    		s=s+sum;
	    	}
	    }
	    System.out.println(s);
		
	}
}
