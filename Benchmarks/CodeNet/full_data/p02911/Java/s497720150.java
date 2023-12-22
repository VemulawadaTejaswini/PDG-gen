/* package whatever; // don't place package name! */

import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        sc.nextLine();
        int[] ans = new int[N];
        int[] ten = new int[N];

        for (int i = 0; i < Q; i++) {
            int a = sc.nextInt();
            ten[a-1] += 1; 
        }
        
        for (int i = 0; i < N; i++) {
            ans[i] = K - Q;
            if(ans[i]+ten[i]>0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}