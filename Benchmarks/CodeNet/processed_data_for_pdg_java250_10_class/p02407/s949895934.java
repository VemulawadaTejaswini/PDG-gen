public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kazu = scan.nextInt();
		int[] num= new int[kazu];
		int i = 0;
		while(i != kazu) {
			num[i] = scan.nextInt();
			i++;
		}
		i--;
		while(i >= 0) {
			System.out.print(num[i]);
			if(i != 0) System.out.print(" ");
			i--;
		}
		System.out.println();
	}
}
