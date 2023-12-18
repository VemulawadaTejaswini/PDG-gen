public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=1;
		int n=1;
		while((x = sc.nextInt()) != 0){
			System.out.printf("Case %d: %d\n",n, x);
			n++;
		}
	}
}
