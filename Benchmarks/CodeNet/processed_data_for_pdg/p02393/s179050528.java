public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		List<Integer> foo = new ArrayList<>();
		foo.add(a);
		foo.add(b);
		foo.add(c);
		 Collections.sort(foo);
		System.out.println(foo.get(0) + " " + foo.get(1) + " " + foo.get(2));
	}
}
