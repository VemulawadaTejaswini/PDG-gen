public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp;
		int i =0;
		while((tmp = sc.nextInt()) != 0) {
			i++;
			System.out.printf("Case %d: %d\n",i,tmp);
		}
	}
}
