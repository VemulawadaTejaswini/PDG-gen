public class Main {
	public static void main(String[] args)
	{
		int count=0;
		boolean sw=false;
		String answer="Heisei";
		int y=0;
		int m=0;
		int d=0;
		String s="";
		int max=0;
		int min=Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		s=S.substring(0,4);
		y=Integer.parseInt(s);
		if(y>2019)
		{
			answer="TBD";
			System.out.println(answer);
			System.exit(0);
		}
		s=S.substring(5,7);
		m=Integer.parseInt(s);
		if(m>4)
		{
			answer="TBD";
			System.out.println(answer);
			System.exit(0);
		}
		s=S.substring(8,10);
		d=Integer.parseInt(s);
		if(d>30)
		{
			answer="TBD";
			System.out.println(answer);
			System.exit(0);
		}
		System.out.println(answer);
	}
}
