class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = new int[3];
        for (int i = 0;i < 3;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < 3;i++) {
            sb.append(a[i]).append(" ");
        }
        System.out.println(sb.substring(0,sb.length()-1));
   }
}
