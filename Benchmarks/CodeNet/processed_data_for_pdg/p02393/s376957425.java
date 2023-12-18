class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp;
        if (c < b) {
            tmp = c;
            c = b;
            b = tmp ;
        }
        if (b < a) {
            tmp = b;
            b = a;
            a = tmp;
        }
        if (c < b) {
            tmp = c;
            c = b;
            b = tmp;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
