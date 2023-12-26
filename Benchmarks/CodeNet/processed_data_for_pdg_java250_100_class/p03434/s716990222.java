public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a, Collections.reverseOrder());
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                alice += a[i];
            } else {
                bob += a[i];
            }
        }
        int result = alice - bob;
        System.out.println(result);
        sc.close();
    }
}
