public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x = (int) Math.pow(x, 3);
		System.out.println(x);
		sc.close();
	}
}
