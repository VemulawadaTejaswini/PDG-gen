public class Main {
	public static void main (String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int a;
		while((a = sc.nextInt()) != 0) {
			arr.add(a);
		}
		for(int i = 0; i < arr.size(); i++) {
			System.out.println("Case " + (i+1) + ": " + arr.get(i));
		}
	}
}
