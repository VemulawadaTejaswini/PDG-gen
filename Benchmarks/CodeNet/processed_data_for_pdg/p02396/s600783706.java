public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x;
		for(int i = 1; (x = scan.nextInt()) != 0; i++){
			System.out.println("Case " + i + ": " + x);
		}
	}
}
