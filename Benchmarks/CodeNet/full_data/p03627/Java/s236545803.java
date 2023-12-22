import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        TreeMap<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            long x = in.nextLong();
            if (map.get(x) == null) {
                map.put(x, 1);
            }
            else {
                map.put(x, map.get(x) + 1);
            }
        }
        ArrayList<Long> v = new ArrayList<>();
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                v.add(entry.getKey());
            }
        }
        Collections.sort(v,  Collections.reverseOrder());
        if (v.size() >= 2) {
            out.println((long) v.get(0) * v.get(1));
        }
        else {
            out.println(0);
        }
        out.close();
    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}

