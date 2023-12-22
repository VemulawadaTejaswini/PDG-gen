//https://atcoder.jp/contests/abc126/tasks/abc126_a

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        StringBuffer S = new StringBuffer(sc.next());
        sc.close();
        if (String.valueOf(S.charAt(K-1)).equals("A")){
            S.setCharAt(K-1, 'a');
        } else if (String.valueOf(S.charAt(K-1)).equals("B")){
            S.setCharAt(K-1, 'b');
        } else if (String.valueOf(S.charAt(K-1)).equals("C")){
            S.setCharAt(K-1, 'c');
        }
        System.out.println(S);
    }
}