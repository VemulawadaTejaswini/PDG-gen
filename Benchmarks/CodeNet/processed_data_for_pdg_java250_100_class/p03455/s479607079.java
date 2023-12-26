public class Main {
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("Even");
		list.add("Odd");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(list.get(a*b % 2));
	}
}
