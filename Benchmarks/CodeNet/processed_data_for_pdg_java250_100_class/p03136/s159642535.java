public class Main {
	public static void main(String[] args)
	{
		int count=0;
		boolean sw=false;
		String answer="No";
		int N=0;
		int max=0;
		int min=0;
		int sum=0;
		int a=0;
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		int L[]=new int[N];
		for(int i=0;i<N;i++)
		{
			L[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++)
		{
			max=Math.max(max,L[i]);
		}
		for(int i=0;i<N;i++)
		{
			if(count==0 && L[i]==max)
			{
				count++;
			}else
			{
				sum+=L[i];
			}
		}
		if(sum>max)
		{
			answer="Yes";
		}
		System.out.println(answer);
	}
}
