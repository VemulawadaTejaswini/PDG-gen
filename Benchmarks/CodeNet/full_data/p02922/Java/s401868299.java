import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());

        scanner.close();

        if (B <= 1) {
            System.out.println(0);
            return;
        }

        int adapters = (B / A);
        int ports = adapters * A;
        // タコ足する分引く
        ports = ports - (adapters >= 2 ? adapters - 1 : 0);
        // 引いて足らなかったadapterをタス
        if (ports < B) {
            adapters++;
        }

        System.out.println(adapters);
    }
}
