

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int nodes[] = new int[N];
        Branch branches[] = new Branch[N-1];

        Map<Integer, List<Integer>> bMap = new HashMap<>();

        ArrayList<Integer> a,b;
        for(int i=0;i<N-1;i++) {
            branches[i] = new Branch();
            branches[i].left = sc.nextInt();
            branches[i].right = sc.nextInt();
            branches[i].color = sc.nextInt();
            branches[i].distance = sc.nextInt();

            a = (ArrayList<Integer>) bMap.get(branches[i].left);
            if (a==null) { a = new ArrayList<>(); }
            a.add(branches[i].right);
            bMap.put(branches[i].left, a);

            a = (ArrayList<Integer>) bMap.get(branches[i].right);
            if (a==null) { a = new ArrayList<>(); }
            a.add(branches[i].left);
            bMap.put(branches[i].right, a);
        }

//        for(int i=1;i<=N;i++) {
//            a = (ArrayList<Integer>) bMap.get(i);
////            System.out.print(i + " : ");
//            if (a != null) {
//                for (Iterator itr = a.iterator(); itr.hasNext(); ) {
////                    System.out.print(itr.next() + " ");
//                }
//            }
//
////            System.out.println();
//        }
////        System.out.println();

//        for (Branch br:branches) {
//            Branch.dump(br);
//        }
//        System.out.println();

        for(int i=0;i<Q;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int u = sc.nextInt();
            int v = sc.nextInt();

//            System.out.println(x + " " + y + " " + u + " " + v);
            for (Branch br:branches) {
                if (br.color == x) {
                    br.tmp_distance = y;
                } else {
                    br.tmp_distance = br.distance;
                }
            }

            int result = -1;
            for (Branch br:branches) {
                if ((br.left == u) || (br.right == u)) {
                    result = calc(branches, br, u, v);
                }
                if (result != -1) {
                    break;
                }
            }
            System.out.println(result);
//            System.out.println();
        }
//        System.out.println();
    }

    private static int calc(Branch[] branches, Branch b, int source, int destination) {
        int result = -1;
        if ((b.left == 0) || (b.right == 0)) {
//            Branch.dump(b);
//            System.out.println("==");
            return -1;
        }

        if ((b.right == destination) || (b.left == destination)) {
            result = b.tmp_distance;
//            Branch.dump(b);
//            System.out.println("<>");
        } else if (b.right == source) {
//            Branch.dump(b);
//            System.out.println(" >");

            for (Branch br:branches) {
                if (!br.equals(b) && ((br.left == b.left) || (br.right == b.left))) {
                    result = calc(branches, br, b.left, destination);
                }
                if (result != -1) {
                    break;
                }
            }

            if (result != -1) {
                result += b.tmp_distance;
            }
        } else if(b.left == source) {
//            Branch.dump(b);
//            System.out.println("< ");

            for (Branch br : branches) {
                if (!br.equals(b) && ((br.left == b.right) || (br.right == b.right))) {
                    result = calc(branches, br, b.right, destination);
                }
                if (result != -1) {
                    break;
                }
            }

            if (result != -1) {
                result += b.tmp_distance;
            }
        }
        return result;
    }

    private static class Branch {
        int left;
        int right;
        int color;
        int distance;
        int tmp_distance;

        static void dump(Branch b) {
            System.out.println("(" + b.left + ", " + b.right + ", " + b.color + ", " + b.tmp_distance + ")");
        }

    }
}