public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        outer: for (int i = 1 ; ; i++) {
            int x = sc.nextInt();
            switch(x) {
                case 0:
                    break outer;
                default:
                    System.out.printf("Case %d: %d\n", i, x);
            }
        }
    }
}
