public class Main {
	public static void main(String[] args) {
		int quantity = 0;
		int length = 0;
		String anser = "";
		Scanner scan = new Scanner(System.in);
        quantity = scan.nextInt();
        length = scan.nextInt();
		String[] str = new String[quantity];
		for(int i = 0;i<quantity;i++) {
			str[i] = scan.next();
		}
		Arrays.sort(str);
		for(String s:str) {
			anser = anser + s;
		}
		System.out.println(anser);
	}
}
