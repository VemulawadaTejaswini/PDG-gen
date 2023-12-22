

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int Q = sc.nextInt();
        Branch branches[] = new Branch[N-1];

        Map<Integer, List<Integer>> bMap = new HashMap<>();

        ArrayList<Integer> a;
        for(int i=0;i<N-1;i++) {
            branches[i] = new Branch();
            branches[i].left = sc.nextInt();
            branches[i].right = sc.nextInt();
            branches[i].color = sc.nextInt();
            branches[i].distance = sc.nextInt();

            a = (ArrayList<Integer>) bMap.get(branches[i].left);
            if (a==null) { a = new ArrayList<>(); }
            a.add(i);
            bMap.put(branches[i].left, a);
            a = (ArrayList<Integer>) bMap.get(branches[i].right);
            if (a==null) { a = new ArrayList<>(); }
            a.add(i);
            bMap.put(branches[i].right, a);
        }

        for(int i=0;i<Q;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int u = sc.nextInt();
            int v = sc.nextInt();
//            System.out.println(x + ", " + y + ", " + u + ", " + v);

            int result = -1;
            Branch br;
            for ( int index : bMap.get(u)) {
                br = branches[index];
//                System.out.println(index);
//            for (Branch br:branches) {
                if ((br.left == u) || (br.right == u)) {
                    result = calc(bMap, branches, br, x, y, u, v);
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

    private static int calc(Map<Integer, List<Integer>> map, Branch[] branches, Branch b, int color, int distance, int source, int destination) {
        int result = -1;
        int d;
        if ((b.left == 0) || (b.right == 0)) {
//            Branch.dump(b);
//            System.out.println("==");
            return -1;
        }

        if (b.color == color) {
            d = distance;
        } else {
            d = b.distance;
        }

        if ((b.right == destination) || (b.left == destination)) {
            result = d;
//            Branch.dump(b);
//            System.out.println("<>");
        } else if (b.right == source) {
//            Branch.dump(b);
//            System.out.println(" >");

            Branch br;
            for ( int index : map.get(b.left)) {
                br = branches[index];
//            for (Branch br:branches) {
//                Branch.dump(b);
//                Branch.dump(br);
                if (!br.equals(b) && ((br.left == b.left) || (br.right == b.left))) {
                    result = calc(map, branches, br, color, distance, b.left, destination);
                }
                if (result != -1) {
                    break;
                }
            }

            if (result != -1) {
                result += d;
            }
        } else if(b.left == source) {
//            Branch.dump(b);
//            System.out.println("< ");

            Branch br;
            for ( int index : map.get(b.right)) {
                br = branches[index];
//            for (Branch br : branches) {
                if (!br.equals(b) && ((br.left == b.right) || (br.right == b.right))) {
                    result = calc(map, branches, br, color, distance, b.right, destination);
                }
                if (result != -1) {
                    break;
                }
            }

            if (result != -1) {
                result += d;
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