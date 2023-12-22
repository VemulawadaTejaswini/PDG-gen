import java.util.*;
import java.io.*;

public class Main {
    static void printArray(int[] ans){
        for(int i=0; i<ans.length-1; i++) System.out.printf("%d ", ans[i]);
        System.out.printf("%d\n", ans[ans.length-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = Math.max(A+B, A-B);
        ans = Math.max(ans, A*B);
        System.out.println(ans);
    }
}