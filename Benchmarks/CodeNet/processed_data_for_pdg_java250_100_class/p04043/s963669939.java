public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] array = new int[] {stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt()};
		Arrays.parallelSort(array);    
		System.out.println(Arrays.equals(array,new int[] {5,5,7}) ? "YES":"NO");
	}
}
