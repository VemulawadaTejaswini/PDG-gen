public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
		int sum = A + B;
		int diff = A - B;
		int prod = A * B;
		int max = sum;
		if(max < diff) {
			max = diff;
		}
		if(max < prod) {
			max = prod;
		}
		System.out.println(max);
	}
}
