public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long count=0;
		long count1=0;
		int[] array = new int[3];
		array[0]=n-m;
		array[1]=n*m;
		array[2]=n+m;
		Arrays.sort(array);
		System.out.println(array[2]);
	}
}
