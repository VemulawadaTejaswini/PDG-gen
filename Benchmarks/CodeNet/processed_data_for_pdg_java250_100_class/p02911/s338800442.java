public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < q; i++) {
            ary[Integer.parseInt(sc.next()) - 1]++;
        }
        for (int num : ary) {
            if (k - (q - num) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
