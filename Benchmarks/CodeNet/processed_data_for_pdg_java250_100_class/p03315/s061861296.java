public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		int num = 0;
		for(int i = 0; i < 4; i++)
		{
			if(s.charAt(i) == '+')
			{
				num++;
			}
			else
			{
				num--;
			}
		}
		System.out.println(num);
	}
}
