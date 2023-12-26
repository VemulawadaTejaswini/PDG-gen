public class Main {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print(" ");
		int  a = scanner.nextInt();
		int  b = scanner.nextInt();
		int answer = a * b;
		if(answer% 2 ==0) {
		    System.out.println("Even");
		}
		else {
		    System.out.println("Odd");
		}
	    scanner.close();
	}
}
