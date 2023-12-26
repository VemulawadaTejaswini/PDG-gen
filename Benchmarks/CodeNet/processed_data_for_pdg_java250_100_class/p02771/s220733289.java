public class Main {
	public static void main(String[] args) {
		int[] array = new int[3];
		Scanner sc = new Scanner(System.in);
		array[0] = sc.nextInt();
		array[1] = sc.nextInt();
		array[2] = sc.nextInt();
		sc.close();
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			linkedHashSet.add(array[i]);
			}
		if(linkedHashSet.size()==2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
