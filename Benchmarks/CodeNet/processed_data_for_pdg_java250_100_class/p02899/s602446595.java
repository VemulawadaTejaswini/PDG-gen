public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int order1[] = new int[number];
		int order2[] = new int[number];
		for(int i = 0; i < number; i++) {
			order1[i] = s.nextInt() -1;
			order2[i] = order1[i];
		}
		Arrays.parallelSort(order1);
		int numbers[] = new int[number];
		for(int i = 0; i < number; i++) {
			numbers[order2[i]]=i;
		}
		for(int i = 0; i < number; i++) {
			int order = order1[i];
			System.out.println(numbers[order] +1);
		}
	}
}
