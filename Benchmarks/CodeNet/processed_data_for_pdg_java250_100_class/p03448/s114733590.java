public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        sc.close();
        int result = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int j2 = 0; j2 <= c; j2++) {
                    int value = 500 * i + 100 * j + 50 * j2;
                    if (value == x) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
