public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		int ab = parseInt(a+b);
		int ab2 = (int)sqrt((double)ab);
		out.println(ab==ab2*ab2?"Yes":"No");
	}
}
