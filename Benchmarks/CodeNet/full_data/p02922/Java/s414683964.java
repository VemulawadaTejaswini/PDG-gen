import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                // 整数の入力
                int tapinput = sc.nextInt();
                int target = sc.nextInt();
                int result = 1;

                if (target > tapinput) {
                        int tmp_count = tapinput;
                        for (int i = 1; i < 21; i++) {
                                tmp_count -= 1;
                                tmp_count += tapinput;
                                if (target <= tmp_count) {
                                        result += i;
                                        break;
                                }
                        }
                }

                // 出力
                System.out.println(result);
        }
}