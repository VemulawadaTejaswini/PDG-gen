//https://atcoder.jp/contests/abc110/tasks/abc110_c

import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        int[] start = new int[26];
        Arrays.fill(start,-1);
        int[] goal = new int[26];
        Arrays.fill(goal,-1);
        int a,b;
        for (int i=0;i<S.length();i++){
            a = S.charAt(i)-'a';
            b = T.charAt(i)-'a';
            if (start[a]!=-1 ^ goal[b]!=-1){
                System.out.println("No");
                return;
            }
            start[a] = b;
            goal[b] = a;
        }
        System.out.println("Yes");
    }
}