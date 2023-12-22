import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = Character.getNumericValue(s.charAt(0));
        int b = Character.getNumericValue(s.charAt(1));
        int c = Character.getNumericValue(s.charAt(2));
        int d = Character.getNumericValue(s.charAt(3));

        boolean solved = false;
        for (OP op1 : OP.values()) {
            for (OP op2 : OP.values()) {
                for (OP op3 : OP.values()) {
                    int total = a;
                    total = calc(total, b, op1);
                    total = calc(total, c, op2);
                    total = calc(total, d, op3);
                    if (!solved && total == 7) {
                        System.out.println(a + op1.symbol + b + op2.symbol + c + op3.symbol + d + "=7");
                        solved = true;
                    }
                }
            }
        }
    }

    static int calc(int m, int n, OP op) {
        return op == OP.PLUS ? m + n : m - n;
    }

    enum OP {
        PLUS("+"),
        MINUS("-");

        private String symbol;
        OP(String symbol) {
            this.symbol = symbol;
        }
    }
}