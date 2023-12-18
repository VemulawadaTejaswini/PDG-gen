public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        for (int i = 0; i < 10000; i++) {
            if ((input = sc.nextInt()) != 0) {
                System.out.println("Case " + (i + 1) + ": " + input);
            } else {
                break;
            }
        }
    }
}
