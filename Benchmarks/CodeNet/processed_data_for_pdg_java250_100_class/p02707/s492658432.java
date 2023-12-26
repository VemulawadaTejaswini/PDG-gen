public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n+1];
		for(int i=0;n+1>i;i++) {
			array[i]=0;
		}
		for(int i=0;n-1>i;i++) {
			int a = sc.nextInt();
			array[a-1]++;
		}
		for(int i=0;n>i;i++) {
			System.out.println(array[i]);
		}
	}
}
