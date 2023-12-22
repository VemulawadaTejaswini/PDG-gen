// package app;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

import jdk.jshell.spi.ExecutionControlProvider;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String S = sc.next();

        final Long N = sc.nextLong();
        Map<Long, Long> map = new HashMap<Long, Long>();
        int[] cntArr = new int[(int) (Math.pow(10, 5) * 2)];
        int[] excludeArr = new int[N.intValue()];
        for (int i = 0; i < N; i++) {
            Long tmp = sc.nextLong();
            if (!map.containsKey(tmp)) {
                cntArr[tmp.intValue()] = 0;
                map.put(Long.valueOf(tmp), 0L);
            } else {
                cntArr[tmp.intValue()]++;
                map.put(Long.valueOf(tmp), map.get(Long.valueOf(tmp)) + cntArr[tmp.intValue()]);
            }
            excludeArr[i] = tmp.intValue();
        }

        for (int i = 0; i < excludeArr.length; i++) {
            Long out = Long.valueOf(0);
            for (Long l : map.keySet()) {
                Long tmp = map.get(l);
                if (excludeArr[i] == l.intValue()){
                    tmp -= cntArr[l.intValue()];
                }
                out = out + tmp;
            }
            System.out.println(out);
        }

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}