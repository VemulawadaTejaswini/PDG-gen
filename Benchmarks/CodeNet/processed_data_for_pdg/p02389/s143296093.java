public class Main{
	public static void main(String[] args){
		String input = new java.util.Scanner(System.in).nextLine();
		String[] words = input.split("\\s");
		int a = Integer.parseInt(words[0]);
		int b = Integer.parseInt(words[1]);
		int ans_area = a * b;
		int ans_long = 2 * ( a + b );
		System.out.println( ans_area + " " + ans_long ); 
	}
}
