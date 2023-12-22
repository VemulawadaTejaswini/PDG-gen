public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if (a == b + c || b==a+c || c==b+a )
			System.out.println("yes");
		else 
			System.out.println("no");
		
		in.close();

	}
}
