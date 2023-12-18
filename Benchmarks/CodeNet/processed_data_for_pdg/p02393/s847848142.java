public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Integer[] Ints = new Integer[3];
		for (int i=0; i<3; i++) {
			Ints[i] = sc.nextInt();
		}
		Arrays.sort(Ints,Comparator.naturalOrder());
		System.out.println(Ints[0]+" "+Ints[1]+" "+Ints[2]);
	}
}
