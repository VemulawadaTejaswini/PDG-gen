public class Main {
	public static void main(String[] args) {
		Scanner jk = new Scanner(System.in);
		int a = jk.nextInt();
		int b = jk.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(a+b);
		arr.add(a-b);
		arr.add(a*b);
		System.out.println(Collections.max(arr));
	}
}
