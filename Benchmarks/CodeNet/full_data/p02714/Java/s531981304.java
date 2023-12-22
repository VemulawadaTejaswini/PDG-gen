//https://atcoder.jp/contests/abc162/tasks/abc162_d


import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(in.nextLine());
        String S = in.nextLine();

        Map<Character, Set<Integer>> map = new HashMap<>(){{
            put('R',new HashSet<>());
            put('G',new HashSet<>());
            put('B',new HashSet<>());
        }};

        for(int i = 0; i < S.length(); i++){
            Set<Integer> set = map.get(S.charAt(i));
            set.add(i+1);
        }

        int ans = map.get('R').size() * map.get('G').size() * map.get('B').size();

        for (int i: map.get('R')) {
            for (int j: map.get('G')) {
                if((i + j) % 2 == 0 && map.get('B').contains((i + j) / 2)) ans--;
            }

        }

//        for (int i: map.get('R')) {
//            for (int j: map.get('B')) {
//                if(i <j && map.get('G').contains(2 * j -i)) ans--;
//            }
//
//        }

        for (int i: map.get('R')) {
            for (int j: map.get('B')) {
                if((i + j) % 2 == 0 && map.get('G').contains((i + j) / 2)) ans--;
            }

        }

//        for (int i: map.get('B')) {
//            for (int j: map.get('G')) {
//                if(i < j && map.get('R').contains(2 * j -i)) ans--;
//            }

//        }

        for (int i: map.get('B')) {
            for (int j: map.get('G')) {
                if((i + j) % 2 == 0 && map.get('R').contains((i + j) / 2)) ans--;
            }

        }

//        for (int i: map.get('G')) {
//            for (int j: map.get('B')) {
//                if(i < j && map.get('R').contains(2 * j -i)) ans--;
//            }
//
//        }


        out.println(ans);





        in.close();
        out.close();
    }
}
