/**
 * Created by fanny on 16-10-23.
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        String line1 = scanner1.nextLine();
        int K = Integer.parseInt(line1.split(" ")[0]);
        int T = Integer.parseInt(line1.split(" ")[1]);

        String line2 = scanner1.nextLine();
        String[] a = line2.split(" ");

        int max = K-1;
        if (T == 1) {
            System.out.println(max);
            return;
        }

        int[] c = new int[T];
        for (int i = 0; i < T; i++) {
            c[i] = Integer.parseInt(a[i]);
        }

        boolean result = false;
        for (int i = 0; i < T; i++) {
            if (c[i] > (K / 2)) {
//                System.out.println(c[i]);
                result = true;
                max = c[i];
            }
        }

        if (!result) {
            System.out.println(0);
            return;
        }
        else{
            int tmp = max;
            for (int i = 0; i < T; i++) {
                if (c[i]!=max) {
                    tmp -= c[i];
                }
            }
            max = tmp-1;
            System.out.println(max);
//            System.out.println("false");
            return;
        }
    }
}

//        List<Integer> intList = new ArrayList<Integer>();
//        for (int i = 0; i < T; i++) {
//            for (int m = 0; m < c[i]; m++)
//                intList.add(i);
//        }
//
//        List<List<Integer>> myLists = perm(intList);
//
//        int min = K-1;
//        List<Integer> b = new ArrayList<>(myLists.size());
//        for (int i=0;i<myLists.size();i++){
//            int count = 0;
//            for (int n=1;n<K;n++) {
//                if (myLists.get(i).get(n) == myLists.get(i).get(n-1))
//                    count ++;
//            }
//            if (min>count)
//                min = count;
//        }
//        System.out.println(min);
//
//    }
//
//    public static List<List<Integer>> perm(List<Integer> list) {
//
//        if (list.size() == 0) {
//            List<List<Integer>> result = new ArrayList<List<Integer>>();
//            result.add(new ArrayList<Integer>());
//            return result;
//        }
//
//        List<List<Integer>> returnMe = new ArrayList<List<Integer>>();
//        Integer firstElement = list.remove(0);
//        List<List<Integer>> recursiveReturn = perm(list);
//
//        for (List<Integer> li : recursiveReturn) {
//            //System.out.println("li  " + li);
//            for (int index = 0; index <= li.size(); index++) {
//                List<Integer> temp = new ArrayList<Integer>(li);
//                temp.add(index, firstElement);
//                //System.out.println("temp " + temp);
//                returnMe.add(temp);
//            }
//        }
//
//        return returnMe;
//    }
