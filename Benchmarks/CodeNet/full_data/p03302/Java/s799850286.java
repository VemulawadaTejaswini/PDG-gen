package text;

public class main {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		if(a * b == 15) {
			System.out.println("*");
		}else {
			if (a + b == 15) {
				System.out.println("+");
			}else {
				System.out.println("×");
			}
		}
    }
}
