public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();
        System.out.println(Integer.toString(num, base).length());
    }
}
