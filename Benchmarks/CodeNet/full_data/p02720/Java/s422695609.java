

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Solution {
        int count = 0;
        int k =0;
        long res = 0;
        List<Long> list = new ArrayList();
        public void find(int k) {
            this.k = k;
            for(int len = 1; count<k; len++) {
                generate(len, 0, 0, -1);
            }
            Collections.sort(list);
            System.out.println(list.get(k-1));
        }

        void generate(int len, long val, int curLen, int prev) {
            if(len == curLen) {
                list.add(val);
                count++;
                if(count == k) {
                    res = val;
                }
                return;
            }

            if(count >= k) {
                res = val;
                return;
            }


            for(int i=0; i<=9; i++) {
                int tmp = 0;
                if(curLen == 0 && i== 0) continue;
                if(prev == -1) {
                    tmp = i;
                } else {
                    if(Math.abs(prev-i) <= 1) {
                        tmp = i;
                    } else {
                        continue;
                    }
                }
                generate(len, val*10+tmp, curLen+1, tmp);
            }
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sol.find(k);
    }
}
