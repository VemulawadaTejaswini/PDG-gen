public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        for (int i = n - 1 ; i >= 0 ; i--) {
            int m = i + 1;
            int count = 0;
            for (int j = m - 1 ; j < n ; j += m) {
                if (b[j] == 1) {
                    count++;
                }
            }
            if (count % 2 != a[i]) {
                b[i] = 1;
            }
        }

        int c = 0;
        for (int i = 0 ; i < n ; i++) {
            if (b[i] == 1) c++;
        }

        System.out.println(c);

        for (int i = 0 ; i < n ; i++) {
            if (b[i] == 1) {
                System.out.print(i + 1);
                System.out.print(" ");
            }
        }

        System.out.print("\n");

    }

}
