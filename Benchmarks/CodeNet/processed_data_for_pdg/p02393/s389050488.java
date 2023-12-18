public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.parallelSort(a);
		for(int i = 0;i<a.length;i++) {
			if(i != a.length-1)
				System.out.print(a[i]+" ");
			else System.out.println(a[i]);
		}
	}
}
