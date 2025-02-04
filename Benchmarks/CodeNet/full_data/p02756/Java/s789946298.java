import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        long Q = Long.parseLong(sc.nextLine());
        boolean isLeadLeft = true;

        StringBuilder sb = new StringBuilder();
        StringBuilder sbLeft = new StringBuilder();
        StringBuilder sbRight = new StringBuilder();
        sb.append(S);

        for (int i = 0; i < Q; i++) {
            String[] queries = sc.nextLine().split(" ");
            if (queries[0].equals("1")) {
                isLeadLeft = !isLeadLeft;
            } else {
                String f = queries[1];
                if (f.equals("1")) {
                    if (isLeadLeft) {
                        sbLeft.append(queries[2]);
                    } else {
                        sbRight.append(queries[2]);
                    }
                } else {
                    if (isLeadLeft) {
                        sbRight.append(queries[2]);
                    } else {
                        sbLeft.append(queries[2]);
                    }
                }
            }
        }

        sc.close();

        if (isLeadLeft) {
            sbLeft.reverse();
            System.out.print(sbLeft.toString());
            System.out.print(sb.toString());
            System.out.print(sbRight.toString());
        } else {
            sbRight.reverse();
            System.out.print(sbRight.toString());
            System.out.print(sb.toString());
            System.out.print(sbLeft.toString());
        }

    }
}
