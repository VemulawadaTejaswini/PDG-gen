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
                String chara = queries[2];
                if (f.equals("1")) {
                    if (isLeadLeft) {
                        sbLeft.insert(0, chara);
                    } else {
                        sbRight.append(chara);
                    }
                } else {
                    if (isLeadLeft) {
                        sbRight.append(chara);
                    } else {
                        sbLeft.insert(0, chara);
                    }
                }
            }
        }

        sc.close();

        if (isLeadLeft) {
            System.out.println(sbLeft.toString() + sb.toString() + sbRight.toString());
        } else {
            sbRight.reverse();
            sb.reverse();
            sbLeft.reverse();
            System.out.println(sbRight.toString() + sb.toString() + sbLeft.toString());
        }

    }
}
