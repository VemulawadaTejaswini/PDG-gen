public class Main{
	public static void main(String[] args){
		String input = new Scanner(System.in).nextLine();
		String[] num = input.split("\\s");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		System.out.println(a * b + " " + 2 * (a + b));
	}
}
