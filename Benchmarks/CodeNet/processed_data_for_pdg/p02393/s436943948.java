class Main{
	public static void main(String[] args){
		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		input.close();
		int min = Math.min(num1, Math.min(num2, num3));
		int max = Math.max(num1, Math.max(num2, num3));
		int median = num1 + num2 + num3 - min - max;
		System.out.printf("%d %d %d\n",min ,median, max);
	}
}
