public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        StringBuilder s = new StringBuilder();
        s.append(a * b);
        s.append(" ");
        s.append(2*(a + b));
        System.out.println(s);
    }
}
