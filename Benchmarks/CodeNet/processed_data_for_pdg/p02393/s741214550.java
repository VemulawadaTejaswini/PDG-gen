class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a>b) {
             int temp = a;
             a = b;
             b = temp;
        }
        if (b>c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a>b) {
           int temp = a;
           a = b;
           b = temp;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
