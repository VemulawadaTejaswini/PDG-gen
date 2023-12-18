public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans1 = x * y;
		int ans2 = (2 * x)+(2 * y);
		System.out.println(ans1 + " " + ans2);
		sc.close();
	}
}
