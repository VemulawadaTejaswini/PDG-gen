public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String a_str = scanner.next();
		String b_str = scanner.next();
		int a = Integer.parseInt(a_str);
		int b = Integer.parseInt(b_str);
		if(a >= -1000 && b <= 1000) {
			System.out.print("a");
			if(a > b) {
				System.out.print(" > ");
			}
			if(a < b) {
				System.out.print(" < ");
			}
			if(a == b) {
				System.out.print(" == ");
			}
			System.out.println("b");
		}
    	scanner.close();
    }
}
