import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String S = sc.next();

        for (int i = 0; i <= S.length(); i++){
            for (int j = i + 1; j <= S.length(); j++){
                long target = Long.parseLong(S.substring(i, j));
                if (target % 2019 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}