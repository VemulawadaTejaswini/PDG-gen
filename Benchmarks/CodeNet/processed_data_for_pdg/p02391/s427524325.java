class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String x;
        if ( a < b ) {
            x = "<";
        } else if ( a > b ) {
            x = ">";
        } else {
            x = "==";
        }
        System.out.printf("%s %s %s\n","a",x,"b");
    }
}
