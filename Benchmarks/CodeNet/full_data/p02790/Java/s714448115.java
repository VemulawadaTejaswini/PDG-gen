import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 19 Jan 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        st = new StringTokenizer(temp, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        br.close();

        if (a < b) for (int i = 0; i < b; i++) System.out.print(a);
        else for (int j = 0; j < a; j++) System.out.print(b);
    }
}
