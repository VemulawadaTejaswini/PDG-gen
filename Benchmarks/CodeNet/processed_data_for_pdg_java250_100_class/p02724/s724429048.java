public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int ans = (X/500)*1000+(X%500)/5*5;
		System.out.println(ans);
	}
}
