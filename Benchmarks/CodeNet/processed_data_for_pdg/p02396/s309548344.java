public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10000];
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
			if(num[i] == 0) break;
		}
		for(int i = 0; i < num.length; i++) {
			if(num[i] == 0) break;
			int j = i + 1;
			System.out.println("Case " + j + ": " + num[i]);
		}
	}
}
