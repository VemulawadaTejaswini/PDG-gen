public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            System.out.println("Case " + cnt + ": " + num);
            cnt++;
        }
    }
}
