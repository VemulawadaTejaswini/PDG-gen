public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = new Integer(sc.next());
        int b = sc.nextInt();
        int menseki = a * b;
        int syuu = 2 * (a + b);
        System.out.print(menseki + " ");
        System.out.println(syuu);
    }
}
