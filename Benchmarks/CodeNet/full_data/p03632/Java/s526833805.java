public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int cul = 0;
        if(b-c > 0) {
            if(b > d) {
                cul = (b -c) - (b -d );
            } else {
                cul = b-c;
            }
        }
        System.out.println(cul);
    }
}