public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String a_str = scanner.next();
		String b_str = scanner.next();
		int a = Integer.parseInt(a_str);
		int b = Integer.parseInt(b_str);
		if(a >= 1 && b <= 100) {
			int menseki = a * b;
			int syu = 2 * (a + b);
			System.out.println(menseki + " " + syu);
		}
    	scanner.close();
    }
}
