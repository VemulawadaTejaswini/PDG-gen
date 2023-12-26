public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long count=0;
		long count1=0;
		int[] array = new int[3];
		Arrays.sort(array);
		if(n%2==0) {
			System.out.println(0.5);
		}else {
			System.out.println((n/2+1.0)/n);
		}
	}
}
