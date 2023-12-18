public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int large = a * b;
		int length = (a + b) * 2;
		System.out.println(large + " " + length);
	}
}
