import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        C();
    }

    public static void A() throws Exception {
        char c = (char)System.in.read();
        char res = '\0';
        switch (c) {
            case 'A':
                res = 'T';
                break;
            case 'T':
                res = 'A';
                break;
            case 'C':
                res = 'G';
                break;
            case 'G':
                res = 'C';
                break;
        }
        System.out.println( res );
    }

    public static void B() throws Exception {
        Scanner scanner = new Scanner( System.in );
        String S = scanner.next();
        boolean inACGT = false;
        int start = 0, len = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt( i );
            boolean isACGT = c == 'A' || c == 'C' || c == 'G' || c == 'T';
            if (inACGT) {
                if (!isACGT) {
                    inACGT = false;
                    len = Math.max( len, i - start );
                }
            } else {
                if (isACGT) {
                    inACGT = true;
                    start = i;
                }
            }
        }
        if (inACGT) len = Math.max( len, S.length() - start );
        System.out.println( len );
    }


    public static void C() throws Exception {
        Scanner scanner = new Scanner( System.in );
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.next();
        int[] res = new int[Q];
        for (int i = 0; i < Q; i++) {
            scanner.nextLine();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            res[i] = findAC( S, l, r );
        }
        for (int r : res) System.out.println(r);

    }

    private static int findAC(String s, int l, int r) {
        boolean foundA = false;
        int count = 0;
        for (int i = l - 1; i < r; i++) {
            char c = s.charAt( i );
            if (foundA && c == 'C') {
                foundA = false;
                count++;
            } else foundA = c == 'A';
        }
        return count;
    }
}
