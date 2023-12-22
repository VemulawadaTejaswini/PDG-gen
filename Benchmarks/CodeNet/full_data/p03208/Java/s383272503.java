import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] trees = new int[n];
        
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(trees);
        /*for (int i = 0; i < n; i++) {
            System.out.println(trees[i]);
        }*/
        
        int min = 1000000000;
        int diff = 0;
        for (int i = 0; i+2 < n; i++) {
            diff = trees[i+2] - trees[i];
            if (diff < min) {
                min = diff;
                //System.out.println(i);
            }
        }
        System.out.println(min);
    }
}
