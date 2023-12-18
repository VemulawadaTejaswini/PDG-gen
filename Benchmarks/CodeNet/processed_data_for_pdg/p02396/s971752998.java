public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int i = 1;
		int a = x.nextInt();
		while(a != 0){
			System.out.println("Case " + i + ": " + a);
			a = x.nextInt();
			i++;
		}
	}
}
