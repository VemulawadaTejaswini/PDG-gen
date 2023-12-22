import java.util.*;
public class Main {

    public static class Heap {
        int number;
        Heap left;
        Heap right;

        public Heap(int number) {
            this.number = number;
        }
    }

    public static class SumResult {
        int count;
        long partialSum;

        public SumResult(int c, long p) {
            count = c;
            partialSum = p;
        }
    }

    public static Heap buildHeap(int asIndices[]) {
        int n = asIndices.length - 1;
        Heap root = new Heap(1);
        for (int number = 2; number <= n; number++) {
            Heap current = root;
            while (true) {
                if (asIndices[number] < asIndices[current.number]) {
                    if (current.left == null) {
                        current.left = new Heap(number);
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        current.right = new Heap(number);
                        break;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
        return root;
    }

    public static SumResult findSumByHeapIter(Heap root) {
        if (root == null) {
            return new SumResult(0, 0);
        } else {
            SumResult leftResult = findSumByHeapIter(root.left);
//            System.out.println(leftResult.count + " " + leftResult.partialSum);
            SumResult rightResult = findSumByHeapIter(root.right);
            return new SumResult(leftResult.count+rightResult.count+1,
                    leftResult.partialSum+rightResult.partialSum+(leftResult.count+1)*(rightResult.count+1)*root.number);
        }
    }

    public static long findSumByHeap(Heap root) {
        return findSumByHeapIter(root).partialSum;
    }

    public static long findSum(int[] as) {
        int n = as.length;
        int[] asIndices = new int[n + 1];
        for (int index = 0; index < n; index++) {
            int number = as[index];
            asIndices[number] = index;
        }
//        for (int i : asIndices) {
//            System.out.println(i);
//        }
        Heap h = buildHeap(asIndices);
        return findSumByHeap(h);
    }

    public static void main(String[] args) {
//        int[] as = {2,1,3};
//        int[] as = {1,3,2,4};
//        int[] as = {5, 4, 8, 1, 2, 6, 7, 3};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        System.out.println(findSum(as));
    }
}
