public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int x;
		s=sc.nextLine();
		x=s.length();
		char ch[]=s.toCharArray();
		for(int i=x-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.print("\n");
	}
}
