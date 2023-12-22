import java.util.*;

import static java.lang.System.*;

// https://atcoder.jp/contests/abc055/tasks/arc069_b
// 12:30-  ２つを固定すると4パターンしかないので全探索。O(n)
public class Main {

    static final String sheep = "S";
    static final String wolf = "W";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = sc.next().split("", 0);

        solver(N, s);
    }

    public static void solver(int N, String[] statements) {

        String[] animals = new String[]{sheep, wolf};
        for (String a1 : animals) {
            for (String a2 : animals) {
                String ans = existPattern(a1, a2, statements);
                if (ans != null) {
                    out.println(ans);
                    return;
                }
            }
        }
        out.println("-1");
    }

    // 与えれれた条件（1番目・2番目の動物、発言）から動物のパターンが存在するかチェックする
    // 存在する場合は、存在するパターンを返却する。なければNullを返却する
    public static String existPattern(String first_animal, String second_animal, String[] statements){

        StringBuilder animal_pattern = new StringBuilder();
        animal_pattern.append(first_animal);
        animal_pattern.append(second_animal);

        String left = first_animal;
        String center = second_animal;
        String right = null;
        // 動物のパターンの列挙
        for(int s=2; s<statements.length; s++){
            //out.println(s+","+left+","+center+","+right+","+statements[s-1]);
            // rightの動物を確認
            if(center.equals(sheep)){
                if(statements[s-1].equals("o")){
                    right = left;
                } else {
                    right = diffAnimal(left);
                }
            } else {
                if(statements[s-1].equals("o")){
                    right = diffAnimal(left);
                } else {
                    right = left;
                }
            }
            animal_pattern.append(right);
            left = center;
            center = right;
        }

        String animal_pattern_str = animal_pattern.toString();
        String[] animal_pattern_str_array = animal_pattern_str.split("", 0);
        //out.println(animal_pattern_str);

        // 1週回ったところで矛盾するかチェック
        String last_before_animal = animal_pattern_str_array[statements.length-2];
        String last_animal = animal_pattern_str_array[statements.length-1];

        String last_statement = statements[statements.length-1];

        if(last_animal.equals(sheep)){   //羊
           if(last_statement.equals("o")){
               if(last_before_animal.equals(first_animal)){
                   return animal_pattern_str;
               }
           } else {
               if(!last_before_animal.equals(first_animal)){
                   return animal_pattern_str;
               }
           }
        } else {                     //狼
            if(last_statement.equals("o")){
                if(!last_before_animal.equals(first_animal)){
                    return animal_pattern_str;
                }
            } else {
                if(last_before_animal.equals(first_animal)){
                    return animal_pattern_str;
                }
            }
        }

        return null;
    }

    public static String diffAnimal(String animal){
        if(animal == sheep){
            return wolf;
        }
        return sheep;
    }
}
