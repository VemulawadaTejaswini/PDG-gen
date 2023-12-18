public class Main {
	public static void main(String[] age){
		String input = new java.util.Scanner(System.in).nextLine();
		String[] arrayinput = input.split(" ");
		int a = Integer.parseInt(arrayinput[0]);
		int b = Integer.parseInt(arrayinput[1]);
		if(a>b){
			System.out.println("a > b");
		}else if(a<b){
			System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}
	}
}
