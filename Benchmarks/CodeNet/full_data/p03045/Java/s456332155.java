import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        int[] Z = new int[N];
        for (int i = 0; i < M; i++) {
            X[i] = scanner.nextInt();
            Y[i] = scanner.nextInt();
            Z[i] = scanner.nextInt();
        }
        scanner.close();

        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < M; i++) {
//            System.out.println("---i::"+i);
            boolean nothing = true;
            for (List<Integer> list : lists) {
                boolean xi = list.contains(X[i]);
                boolean yi = list.contains(Y[i]);
                if (xi && !yi) list.add(Y[i]);
                if (!xi && yi) list.add(X[i]);
                if (xi || yi) nothing = false;
            }
//            System.out.println("nothing::"+nothing);
            if (nothing) {
                List<Integer> list = new ArrayList<>();
                list.add(X[i]);
                list.add(Y[i]);
                lists.add(list);
//                System.out.println("create list:"+list);
            }
        }

        // check
        int count = 0;
        int[] check = new int[N];
        for (List<Integer> list : lists) {
            count++;
//            System.out.println("countList:"+list);
            for (int num : list) {
                check[num - 1] = 1;
            }
        }
        for (int num : check) {
            if (num != 1) count++;
        }


        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }


}
