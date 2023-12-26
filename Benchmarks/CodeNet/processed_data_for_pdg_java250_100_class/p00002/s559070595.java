public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		ArrayList<String> str = new ArrayList<String>();
		String[] result;
		while(s.hasNext())
		{
			a = s.nextInt();
			b = s.nextInt();
			System.out.println(String.valueOf(a+b).length());
		}
	}
}
