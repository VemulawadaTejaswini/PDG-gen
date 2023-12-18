public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int array[] = {a,b,c};
		Arrays.sort(array);
		System.out.println(array[0] +" "+ array[1] +" "+ array[2]);
	}
}
