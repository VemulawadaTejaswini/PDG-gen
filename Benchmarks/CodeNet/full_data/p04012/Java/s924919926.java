import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            HashMap<Character, Integer> hm
                = new HashMap<Character, Integer>();

            for (int i = 0; i < s.length(); i++) {
                char at = s.charAt(i);
                if (!hm.containsKey(at)) hm.put(at, 0);
                hm.put(at, hm.get(at) + 1);
            }

            boolean flg = true;

            for (char c : hm.keySet()) {
                if (hm.get(c) % 2 == 1) {
                    flg = false;
                    break;
                }
            }

            System.out.println(flg ? "Yes" : "No");
        }
    }
}
