public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int A = 0;
		int B = 0;
		int C = 0;
		String s;
		Scanner sc = new Scanner(System.in);
		A = Integer.parseInt(sc.next());
		B = Integer.parseInt(sc.next());
		C = Integer.parseInt(sc.next());
		if((A<B&&B<C)||(C<B&&B<A)){
			System.out.println("No");
		}
		else
			System.out.println("Yes");
	}

}