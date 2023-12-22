import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int H = in.nextInt();
        int W = in.nextInt();
        char[][] s = new char[H][W];
        int white = 0;
        for (int i=0;i<H;i++) {
            String S = in.next();
            for (int j=0;j<W;j++) {
                s[i][j] = S.charAt(j);
                if (s[i][j]=='.') {
                    white++;
                }
            }
        }

        int ans = 0;
        int[][] flag = new int[H][W];
        ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
        int[] first = {0, 0, 1};
        queue.add(first);
        while (!queue.isEmpty()) {
            int[] rem = queue.poll();
            if (0<=rem[0] && rem[0]<H && 0<=rem[1] && rem[1]<W && flag[rem[0]][rem[1]]==0 && s[rem[0]][rem[1]]!='#') {
                flag[rem[0]][rem[1]]=1;
                int[] add_1 = {rem[0]+1, rem[1], rem[2]+1};
                int[] add_2 = {rem[0]-1, rem[1], rem[2]+1};
                int[] add_3 = {rem[0], rem[1]+1, rem[2]+1};
                int[] add_4 = {rem[0], rem[1]-1, rem[2]+1};
                queue.add(add_1);
                queue.add(add_2);
                queue.add(add_3);
                queue.add(add_4);
                if (rem[0]==H-1 && rem[1]==W-1) {
                    ans = rem[2];
                }
            }
        }

        if (ans==0) {
            out.println(-1);
        } else {
            out.println(white-ans);
        }
        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
