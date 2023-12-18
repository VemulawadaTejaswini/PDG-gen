public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        int nokori = 3;
        int hinan;
        while (nokori > 0) {
            for (int i = 0; i < nokori - 1; i ++) {
                if (a[i] > a[i + 1]) {
                    hinan = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = hinan;
                }
            }
            nokori --;
        }
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
}
