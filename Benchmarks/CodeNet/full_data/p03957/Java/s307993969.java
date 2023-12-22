/**
 * Created by fanny on 16-10-23.
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        int K = scanner1.nextInt();
        int T = scanner1.nextInt();

        int[] a = new int[T];
        for (int i = 0; i < T; i++) {
            a[i] = scanner1.nextInt();
        }

        if(T==1) {
            System.out.println(K - 1);
            return;
        }

        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < T; i++) {
            for (int m = 0; m < a[i]; m++)
                intList.add(i);
        }

        List<List<Integer>> myLists = perm(intList);

        int min = K-1;
        List<Integer> b = new ArrayList<>(myLists.size());
        for (int i=0;i<myLists.size();i++){
            int count = 0;
            for (int n=1;n<K;n++) {
                if (myLists.get(i).get(n) == myLists.get(i).get(n-1))
                    count ++;
            }
            if (min>count)
                min = count;
        }
        System.out.println(min);

    }

    public static List<List<Integer>> perm(List<Integer> list) {

        if (list.size() == 0) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            result.add(new ArrayList<Integer>());
            return result;
        }

        List<List<Integer>> returnMe = new ArrayList<List<Integer>>();
        Integer firstElement = list.remove(0);
        List<List<Integer>> recursiveReturn = perm(list);

        for (List<Integer> li : recursiveReturn) {
            //System.out.println("li  " + li);
            for (int index = 0; index <= li.size(); index++) {
                List<Integer> temp = new ArrayList<Integer>(li);
                temp.add(index, firstElement);
                //System.out.println("temp " + temp);
                returnMe.add(temp);
            }
        }

        return returnMe;
    }

}
