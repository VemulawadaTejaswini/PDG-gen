import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();

            int K = 0;

            String pre = S.substring(0, 1);
            //System.out.println(pre);
            K++;

            int index = 1;
            while (true) {
                if (index == S.length()) {
                    break;
                }

                String str = S.substring(index, index + 1);
                if (!pre.equals(str)) {
                    pre = str;
                    //System.out.println(pre);
                    K++;
                    index++;
                    continue;
                }

                if (index + 1 == S.length()) {
                    break;
                }

                pre = S.substring(index, index + 2);
                //System.out.println(pre);
                K++;
                index += 2;
            }

            System.out.println(K);
        }
    }

}
