public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			int Size = input.length();
			String[] n =new String[30];
			for(int i=0;i<Size;i++)
			{
				n[i] = input.substring(i,i+1);
			}
			for(int i=(Size-1);i>-1;i--)
			{
				if(i==0)
					System.out.println(n[i]);
				else
					System.out.print(n[i]);
			}
	}
}
