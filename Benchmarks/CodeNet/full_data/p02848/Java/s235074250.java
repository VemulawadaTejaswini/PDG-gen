import java.io.*;
// import java.math.*;
// import java.util.*;
// import java.util.Map.*;
// import java.util.stream.*;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader reader =
            new BufferedReader (new InputStreamReader (System.in));
        int N = Integer.parseInt (reader.readLine());
        String S = reader.readLine();
        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println (
            trans (S, alp, alp.substring (N) + alp.substring (0, N)));
        return;
    }

    static String trans (String S, String f, String t) {
        for (int i = 0; i < S.length(); i++) {
            int idx = f.indexOf (S.charAt (i));
            S = S.substring (0, i) + t.charAt (idx) + S.substring (i + 1);
        }
        return S;
    }
}