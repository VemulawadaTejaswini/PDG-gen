public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        while (x != 0) {
            if (x % 10 == 7) {
                System.out.println("Yes");
                return;
            }
            x /= 10;
        }
        System.out.println("No");
    }
}
