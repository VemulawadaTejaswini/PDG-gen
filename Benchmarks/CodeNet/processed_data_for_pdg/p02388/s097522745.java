public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a = n;
        for (int i = 0; i < 2; i++) {
            a = a * n;
        }
        System.out.println(a);
    }
}
