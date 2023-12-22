    package me.awataki;
     
    import java.util.Scanner;
     
    public class Main {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            // 配列の長さは必要ないので読み捨て
            sc.nextInt();
            String str = sc.next();
            System.out.println(str.split("ABC",-1).length -1);
        }
    }