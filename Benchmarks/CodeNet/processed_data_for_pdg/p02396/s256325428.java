class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i = 1;
        while(true) {
            int n = num.nextInt();
            if (n == 0) break;
            System.out.println("Case " + i + ": " + n);
            i++;
        }
    }
}
