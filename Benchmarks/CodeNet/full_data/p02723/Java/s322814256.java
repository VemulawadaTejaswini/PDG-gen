import java.util.*;

/*
問題文


*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String temp[] = new String[s.length()];
        String Flg = "No";
        for (int i = 0; i < s.length(); i++) {
            temp[i] = String.valueOf(s.charAt(i));
        }

        // 配列のインデックスを利用して、文字列を変換
        if (temp[2].equals(temp[3]) && temp[4].equals(temp[5])) {
            Flg = "Yes";
        }
        System.out.println(Flg);
    }
}