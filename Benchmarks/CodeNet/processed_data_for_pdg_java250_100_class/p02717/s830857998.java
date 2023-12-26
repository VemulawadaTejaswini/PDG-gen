public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp;
		int box_a = sc.nextInt();
		int box_b = sc.nextInt();
		int box_c = sc.nextInt();
		tmp = box_a;
		box_a = box_b;
		box_b = tmp;
		tmp = box_a;
		box_a = box_c;
		box_c = tmp;
		System.out.println(box_a + " " + box_b + " " + box_c);
	}
}
