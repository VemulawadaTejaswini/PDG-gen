public class Main {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int[] foo = new int[3]; 
		foo[0] = num.nextInt();
		foo[1] = num.nextInt();
		foo[2] = num.nextInt();
		Arrays.sort(foo);
		System.out.println(foo[0]+" "+foo[1]+" "+foo[2]);
	}
}
