public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int c = sc.nextInt(); 
		int d = sc.nextInt(); 
		double num1 = Math.ceil((double)a / d) + 1;
		double num2 = Math.ceil((double)c / b) + 1;
		if(num2 <= num1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
