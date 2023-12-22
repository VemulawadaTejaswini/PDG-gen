// https://atcoder.jp/contests/agc034/tasks/agc034_a

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String S = sc.next();
        sc.close();
        boolean pass = true;
        for (int i=A+2;i<Math.max(C,D)-1;i++){
            String s1 = String.valueOf(S.charAt(i-1));
            String s2 = String.valueOf(S.charAt(i));
            if (s1.equals("#") && s2.equals("#")){
                System.out.println("No");
                return;
            }
        }
        for (int i=B;i<Math.min(C, D);i++){
            String s1 = String.valueOf(S.charAt(i-1));
            String s2 = String.valueOf(S.charAt(i));
            String s3 = String.valueOf(S.charAt(i+1));
            if (C>D){
                if (s1.equals(".") && s2.equals(".") && s3.equals(".")){
                    pass = true;
                    break;
                } else {
                    pass = false;
                }
            }
        }
        if (pass){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}