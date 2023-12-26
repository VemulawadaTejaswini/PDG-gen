public class Main
{
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int k;
		String s;
		k = ulaz.nextInt();
		s = ulaz.next();
		if (s.length() <= k)
		    System.out.println(s);
		else
		{
		    for (int i = 0; i < k; i++)
		        System.out.print(s.charAt(i));
		    System.out.print("...");
		}
	}
}
