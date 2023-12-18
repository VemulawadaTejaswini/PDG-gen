class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.printf("%d %d\n",num1 * num2,(num1 + num2) * 2);
		sc.close();
	}	
}
