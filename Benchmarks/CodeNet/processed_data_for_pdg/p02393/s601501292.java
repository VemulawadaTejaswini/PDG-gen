public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(){
			{
				add(a);
				add(b);
				add(c);
			}
		};
		list.sort(naturalOrder());
		System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
		scan.close();
	}
}
