public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int x;
		int i = 0;
		while ( 0 !=  ( x = sc.nextInt() ) ) {
			i++;
			sb.append("Case ").append(i).append(": ").append(x).append("\n");
		}
		System.out.print(sb);
	}
}
