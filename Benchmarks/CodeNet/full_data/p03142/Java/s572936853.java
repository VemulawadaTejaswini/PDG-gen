import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().split(" ", 2);
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        Map<Integer, Integer> inputMap = new HashMap<>();
        Map<Integer, Set<Integer>> parentsMap = new HashMap<>();
        for (int i = 0; i < n - 1 + m; i++) {
            String[] ab = scanner.nextLine().split(" ", 2);
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            inputMap.put(a, b);

            Set<Integer> parents = parentsMap.get(b);
            if (parents == null) {
                parents = new HashSet<>();
                parentsMap.put(b, parents);
            }
            parents.add(a);
        }

        // remove indirect parents from parents
        for (Map.Entry<Integer, Set<Integer>> entry : parentsMap.entrySet()) {
            Integer child = entry.getKey();
            Set<Integer> parents = entry.getValue();
            if (parents.size() == 1) continue;

            Integer[] parentsArray = parents.toArray(new Integer[parents.size()]);
            for (Integer parent : parentsArray) {
                if (removeParents(parentsMap, parents, child, parent)) {
                    break;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (parentsMap.containsKey(i)) {
                for (Integer parent : parentsMap.get(i)) {
                    System.out.println(parent);
                    break;
                }
            } else {
                System.out.println(0);
            }
        }
    }

    private static boolean removeParents(Map<Integer, Set<Integer>> parentsMap, Set<Integer> parentsSet, Integer child, Integer parent) {
        Set<Integer> parentParents = parentsMap.get(parent);
        if (parentParents == null) {
            return false;
        }

        for (Integer parentParent : parentParents) {
            if (parentsSet.remove(parentParent) && parentsSet.size() == 1) {
                return true;
            }
            if (removeParents(parentsMap, parentsSet, child, parentParent)) {
                return true;
            }
        }
        return false;
    }
}
