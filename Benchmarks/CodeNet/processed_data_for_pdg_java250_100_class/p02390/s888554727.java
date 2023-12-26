public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int h = 0;
        int m = 0;
        int s = 0;
        h = S / (60 * 60);
        S =  S % (60 * 60);
        m = S / 60;
        S =  S % 60;
        s = S;
        System.out.println(h + ":" + m + ":" + s);
    }
}
