public class Main
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String []s=br.readLine().split(" ");
		long A=Long.parseLong(s[0]);
		long B=Long.parseLong(s[1]);
		long C=Long.parseLong(s[2]);
		long K=Long.parseLong(s[3]);
		long sum=0;
		boolean flag=true;
		if(K>A && flag==true)
		{
			K-=A;
			sum+=A;
		}
		else if(K<=A && flag==true)
		{
			sum+=K;
			K=0;
			flag=false;
		}
		if(K>B &&  flag==true)
		{
			K-=B;
		}
		else if(K<=B && flag==true)
		{
			K=0;
			flag=false;
		}
		if(K>C && flag==true)
		{
			K-=C;
			sum-=C;
		}
		else if(K<=C && flag==true)
		{
			sum-=K;
			K=0;
			flag=false;
		}
		out.println(sum);
	}
}
