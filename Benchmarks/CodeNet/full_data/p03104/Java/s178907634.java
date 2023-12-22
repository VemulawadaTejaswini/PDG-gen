public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in[];
        long a, b, x, y, ret;
        in = scanner.nextLine().split(" ");
        a = Long.parseLong(in[0]);
        b = Long.parseLong(in[1]);

        ret = 0;
        for (long i = a; i < b; i+=2) {
            x = i;
            y = i+1;
            ret ^= x ^ y;
        }
        if ((b - a) % 2 == 0) {
            ret ^= b;
        }

        System.out.println(ret);
    }
}