public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = new int[3];
		num[0] = Integer.parseInt(in.next());
		num[1] = Integer.parseInt(in.next());
		num[2] = Integer.parseInt(in.next());
		Arrays.sort(num);
		System.out.println(num[0] + " " + num[1] + " " + num[2]);
	}
}	
