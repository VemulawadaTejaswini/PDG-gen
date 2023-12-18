class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		int a = value;
		value = scan.nextInt();
		int b = value;
		value = scan.nextInt();
		int c = value;
		int[] values = {a,b,c};
		Arrays.sort(values);
		System.out.println(String.format("%s %s %s", values[0],values[1],values[2]));
	}
}
