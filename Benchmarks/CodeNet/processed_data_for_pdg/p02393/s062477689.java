class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = new int[3];
        for (int i = 0;i < 3;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0;i < 3;i++) {
            System.out.print(a[i]);
            if (i==2) break;
            System.out.print(" ");
        }
        System.out.println("");
    }
}
