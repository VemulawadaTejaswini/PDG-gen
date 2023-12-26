public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Boolean flg = false;
        for (int i = 9; i >= 1; i--) {
            if (N % i == 0 && N / i <= 9) {
                flg = true;
                break;
            }
        }
        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
