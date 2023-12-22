import java.util.Scanner;;
class Qualification_simulator {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		String S = sc1.nextLine();
		findyes(S,N,A,B);
	}
	public static void findyes(String S,int N,int A,int B)
	{
		int suma = 0;
		int sumb = 0;
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i) == 'a')
			{
				suma++;	
				if((suma+sumb) <= (A+B))
				{
					System.out.println("Yes");	
				}
				else
				{
					System.out.println("No");	
				}
			}
			if(S.charAt(i) == 'b')
			{
				sumb++;
				if((suma+sumb) <= (A+B) && sumb <=B)
				{
					System.out.println("Yes");
				}
				else
				{
					sumb--;
					System.out.println("No");	
				}
			}
			if(S.charAt(i) == 'c')
			{
				System.out.println("No");
			}
		}
	}
}
