public class A086 {
	public static void main(String args[]) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int ab = a * b;

		if(ab % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}

