public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print(a[0] + " ");
        System.out.print(a[1] + " ");
        System.out.println(a[2]);
        sc.close();
    }
}
