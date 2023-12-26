public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			linkedHashSet.add(array[i]);
			}
		linkedHashSet.size();
		if(linkedHashSet.size()==array.length) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
