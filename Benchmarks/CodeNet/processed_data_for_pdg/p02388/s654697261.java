public class Main {
	public static void main(String [] args)
	{
		Scanner stdin = new Scanner (System.in);
		int num = stdin.nextInt();
		if(num >= 1 && num <= 1000 ){
				num = num*num*num;
		}
		System.out.println(num);
	}
}
