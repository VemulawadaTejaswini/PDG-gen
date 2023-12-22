
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.lang.Integer.*;

public class Main {
    public static List<String> permutation(List<String> list, String target, String ans){
        if(target.length() <= 1) {
            list.add(ans + target);
        } else {
            for (int i = 0; i < target.length(); i++) {
                String tar = target.substring(0, i) + target.substring(i + 1);
                String an = ans + target.charAt(i);

                permutation(
                        list,
                        target.substring(0, i) + target.substring(i + 1),
                        ans + target.charAt(i)
                );
            }
        }
        return list;
    }
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = parseInt(scanner.next());
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < n; i++)  {
            ArrayList<Integer> array = new ArrayList<>();
            for(int j = 0; j < 2 ; j++) {
                array.add(Integer.parseInt(scanner.next()));
            }
            arrays.add(array);
        }


        String number = "";
        for(int i = 1; i <= n; i++) {
            number += i;
        }

        List<String> listA = new ArrayList<>();
        permutation(listA, number, "");

        double result = 0.0;
        double re = 0.0;
        for(int i = 0; i < listA.size(); i++) {
            String[] arr = listA.get(i).split("");
            //System.out.println(Arrays.toString(arr));
            int[] iar = Stream.of(arr).mapToInt(Integer::parseInt).toArray();
            for(int j =0; j < arr.length - 1; j++) {
                double route1 = Math.abs(Math.pow(arrays.get(iar[j] -1).get(0) - arrays.get(iar[j+1] -1).get(0),2));
                double route2 = Math.abs(Math.pow(arrays.get(iar[j] -1).get(1) - arrays.get(iar[j+1] -1).get(1),2));
                result += Math.sqrt(route1 + route2);

            }
        }
        System.out.println(result/ listA.size());

    }
}