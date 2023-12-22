import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        int n = nextInt();
        List<Integer> pList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pList.add(nextInt());
        }
        List<Integer> qList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            qList.add(nextInt());
        }

        String p = pList.toString();
        String q = qList.toString();
        List<String> permutations = permutations(n);
        int pIndex = -1;
        int qIndex = -1;
        for (int i = 0; i < permutations.size(); i++) {
            if (permutations.get(i).equals(p)) {
                pIndex = i;
            }
            if (permutations.get(i).equals(q)) {
                qIndex = i;
            }
        }

        System.out.println(Math.abs(pIndex - qIndex));
    }

    private static List<String> perms;
    private static List<Integer> perm;
    private static boolean[] chosen;

    private static List<String> permutations(int n) {
        perms = new ArrayList<>();
        perm = new ArrayList<>();
        chosen = new boolean[n + 1];
        permuationHelper(n);
        perms.sort(String::compareTo);
        return perms;
    }

    private static void permuationHelper(int n) {
        if (perm.size() == n) perms.add(perm.toString());
        else {
            for (int i = 1; i <= n; i++) {
                if (!chosen[i]) {
                    chosen[i] = true;
                    perm.add(i);
                    permuationHelper(n);
                    perm.remove((Integer)i);
                    chosen[i] = false;
                }
            }
        }
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}