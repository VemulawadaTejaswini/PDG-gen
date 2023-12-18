public class Main {
    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
            System.out.println("Case " + count + ": " + x);
            count++;
        }
    }
}
