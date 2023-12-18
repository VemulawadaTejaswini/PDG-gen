public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String sign = "";
        if( a < b ) {
            sign = "<";
        } else if( a > b ) {
            sign = ">";
        } else if( a == b ) {
            sign = "==";
        }
        System.out.printf("a %s b\n", sign);
        sc.close();
    }
}
