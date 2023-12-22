import java.util.*;

import javax.swing.text.AbstractDocument.BranchElement;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer> ans = new TreeSet<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                ans.add(i);
            }
        }
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                ans.add(i);
            }
        }
        int i = 1;
        for (Integer result : ans) {
            if(i == k){
                System.out.println(result);
                break;
            }
            i++;
        }

    }
}
