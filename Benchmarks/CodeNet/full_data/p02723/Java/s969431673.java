import java.util.*;

/*
問題文


*/

public class Main {
    public static void main(String[] args){

        // インデックスが取得できるようListにする
        List<String> list = Arrays.asList(item); 

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String temp[] = new String[s.length()];
        String Flg = "No";
        for (int i = 0; i < s.length(); i++) {
            temp[i] = String.valueOf(s.charAt(i));
        }
       if (temp[2].equals(temp[3]) && temp[4].equals(temp[5])) {
            Flg = "Yes";
        }
        System.out.println(Flg);
    }
}