
import java.util.*;

import static java.lang.System.*;

// https://atcoder.jp/contests/abc055/tasks/arc069_b
// 12:30-  ２つを固定すると4パターンしかないので全探索。O(n)
public class Main {

    static final char sheep = 'S';
    static final char wolf = 'W';

    static final char same = 'o';
    static final char diff = 'x';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] statements = sc.next().toCharArray();

        solver(N, statements);
    }

    public static void solver(int N, char[] statements) {

        char[] animals = new char[]{sheep, wolf};
        for (char a1 : animals) {
            for (char a2 : animals) {
                char[] ans = existPattern(a1, a2, N, statements);
                if (ans != null) {
                    out.println(String.valueOf(ans));
                    return;
                }
            }
        }
        out.println("-1");
    }

    // 与えれれた条件（1番目・2番目の動物、発言）から動物のパターンが存在するかチェックする
    // 存在する場合は、存在するパターンを返却する。なければNullを返却する
    public static char[] existPattern(char first_animal, char second_animal, int N, char[] statements){

        char[] ans = new char[N];
        ans[0] = first_animal;
        ans[1] = second_animal;

        char left_ani = first_animal;
        char center_ani = second_animal;
        char right_ani;

        // パターンを列挙
        for(int n=2; n<N; n++){
            char center_statement = statements[n-1];
            switch (center_ani) {
                case (sheep):
                    switch (center_statement){
                        case (same):
                            right_ani = left_ani;
                            break;
                        default:
                            right_ani = diffAnimal(left_ani);
                    }
                    break;

                default:    // wolf
                    switch (center_statement){
                        case(same):
                            right_ani = diffAnimal(left_ani);
                            break;
                        default:
                            right_ani = left_ani;
                    }
            }
            ans[n] = right_ani;
            left_ani = center_ani;
            center_ani = right_ani;
        }

        //out.println(ans);

        // 1週回ったところで矛盾するかチェック
        char last_before_animal = ans[N-2];
        char last_animal = ans[N-1];
        char last_statement = statements[N-1];

        switch (last_animal) {
            case (sheep):
                switch (last_statement){
                    case (same):
                        if(last_before_animal == first_animal){
                            return ans;
                        }
                        break;
                    default:
                        if(last_before_animal != first_animal){
                            return ans;
                        }
                }
                break;

            default:    // wolf
                switch (last_statement){
                    case(same):
                        if(last_before_animal != first_animal){
                            return ans;
                        }
                        break;
                    default:
                        if(last_before_animal == first_animal){
                            return ans;
                        }
                }
        }
        return null;
    }

    public static char diffAnimal(char animal){
        if(animal == sheep){
            return wolf;
        }
        return sheep;
    }
}
