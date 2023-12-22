import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[][] ab = new int[n - 1][2];
        int[][] px = new int[q][2];
        int[] nValue = new int[n];
        Arrays.fill(nValue, 0);
        Map<Integer, List<Integer>> children = new TreeMap<Integer, List<Integer>>();
 
        for (int i = 0; i < n - 1; i++) {
            ab[i][0] = scanner.nextInt();
            ab[i][1] = scanner.nextInt();
        }
        for (int i = 0; i < q; i++) {
            px[i][0] = scanner.nextInt();
            px[i][1] = scanner.nextInt();
        }
 
        for (int i = 0; i < n - 1; i++) {
            if (!children.containsKey(ab[i][0])) {
                List<Integer> tmp = new ArrayList<Integer>();
                tmp.add(ab[i][1]);
                children.put(ab[i][0], tmp);
            } else {
                children.get(ab[i][0]).add(ab[i][1]);
            }
        }
 
        for (int i = n - 1; i >= 0; i--) {
            if (children.containsKey(i)) {
                List<Integer> tList = new ArrayList<>();
                for (int tmp : children.get(i)) {
                    if (children.containsKey(tmp))
                        tList.addAll(children.get(tmp));
                }
                children.get(i).addAll(tList);
            }
        }
 
        for (int i = 0; i < q; i++) {
            int root = px[i][0];
            nValue[root - 1] += px[i][1];
            if (children.containsKey(root)) {
                for (int tNode : children.get(root)) {
                    nValue[tNode - 1] += px[i][1];
                }
            }
        }
 
        for (int i = 0; i < n; i++) {
            System.out.print(nValue[i] + " ");
        }
    }
 
}