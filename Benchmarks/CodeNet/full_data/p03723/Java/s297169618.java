import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer A = Integer.parseInt(sc.next());
        Integer B = Integer.parseInt(sc.next());
        Integer C = Integer.parseInt(sc.next());
        int count = 0;
        int tmpA = 0;
        int tmpB = 0;
        int tmpC = 0;

        List<String> ABCList = new ArrayList<String>();
        ABCList.add(A.toString() + B.toString() + C.toString());

        while (true) {
            if (A % 2 != 0 || B % 2 != 0 || C % 2 != 0) {
                break;
            }
            tmpA = A;
            tmpB = B;
            tmpC = C;

            A = tmpB / 2 + tmpC / 2;
            B = tmpC / 2 + tmpA / 2;
            C = tmpA / 2 + tmpB / 2;

            count++;

            if (ABCList.contains(A.toString() + B.toString() + C.toString())) {
                count = -1;
                break;
            }
            ABCList.add(A.toString() + B.toString() + C.toString());
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        out.flush();
        sc.close();
    }
}