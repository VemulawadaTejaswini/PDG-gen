class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, ms, ns;
        a = in.nextInt();
        b = in.nextInt();
        ms = a*b;
        ns = (a+b)*2;
        System.out.println(ms + " " + ns);
    }
}
