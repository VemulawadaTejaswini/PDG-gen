import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int a = in.codePointAt(0) - '0';
        int b = in.codePointAt(1) - '0';
        int c = in.codePointAt(2) - '0';
        int d = in.codePointAt(3) - '0';

        for (int i = 0; i < 8; i++) {
            int result = a;
            result += ((i & 0x01) != 0) ? b : -b ;
            result += ((i & 0x02) != 0) ? c : -c ;
            result += ((i & 0x04) != 0) ? d : -d ;
            if (result == 7) {
                System.out.println(String.format("%d%c%d%c%d%c%d=7",a,((i & 0x01) != 0) ? '+' : '-',b,((i & 0x02) != 0) ? '+' : '-',c,((i & 0x04) != 0) ? '+' : '-',d));
                System.exit(0);
            }
        }
    }
}
