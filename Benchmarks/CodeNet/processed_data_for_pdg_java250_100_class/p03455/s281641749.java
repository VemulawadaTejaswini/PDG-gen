public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean isOdd = ((a&b)&1)==1;
		System.out.println(isOdd ? "Odd" : "Even");
	}
}
