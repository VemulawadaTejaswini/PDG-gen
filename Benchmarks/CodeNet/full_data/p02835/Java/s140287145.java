import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class TestCase {

    public static void main(String[] args) throws Exception {
        new Thread(null, null, "Vivek K", 99999999) {
            public void run() {
                try {
                    solve();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }.start();
    }


    public static void solve() throws Exception {
        // solve the problem here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NString = br.readLine();
        String[] arr = NString.split(" ");
        StringBuilder sb = new StringBuilder();
        int  a = Integer.valueOf(arr[0]);
        int  b = Integer.valueOf(arr[1]);
        int  c = Integer.valueOf(arr[2]);

        sb.append((a + b + c) < 22 ? "win" : "bust");
        System.out.println(sb);
        
    }
}
