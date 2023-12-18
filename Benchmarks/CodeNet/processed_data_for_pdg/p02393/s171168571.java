public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[3];
		int b = 1;
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		Arrays.sort(num);
		for(int a:num) {
			if(b != 3) {
				System.out.print(a + " ");
			}else {
				System.out.println(a);
			}
			b++;
		}
	}
}
