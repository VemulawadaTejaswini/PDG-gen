public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(sc.hasNext()) {
			int x = sc.nextInt();
			if(x == 0)	break;
			System.out.printf("Case %d: %d\n", i, x);
			i++;
		}
	}
}
