public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int array[] = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		Arrays.sort(array);
		System.out.println(array[0]+" "+array[1]+" "+array[2]);
	}
}
