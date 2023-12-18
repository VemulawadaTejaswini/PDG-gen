public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		Collections.sort(list);
		System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
		sc.close();
	}
}
