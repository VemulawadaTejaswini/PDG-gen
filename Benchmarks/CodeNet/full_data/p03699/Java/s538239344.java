public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int sum=0;
		int[]arry=new int[N];
		for(int i=0;i<N;i++)
		{arry[i]=sc.nextInt();}
		for(int i=0;i<N;i++)
		{sum+=arry[i];}

		if(sum%10==0)
		{
			for(int i=0;i<N;i++)
			{
				if ((sum-arry[i])%10!=0)
				{sum-=arry[i];
			         System.out.println(sum);
			         break;} 
			        else 
                                 {System.out.println("0");
			          break; }		    
			}
		}
		else System.out.println(sum);
	
}
}