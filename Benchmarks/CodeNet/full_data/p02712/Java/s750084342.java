

import java.util.Scanner;

public class Main {
    static class Solution {
        public void find() {

        }

    }

    public static void main(String[] args) {
       Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0;
        for(int i=1; i<=n; i++) {
            if(i%3 != 0 && i%5 != 0) {
                res += i;
            }
        }
        System.out.println(res);
        sol.find();
    }
}
