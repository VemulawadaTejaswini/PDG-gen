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

        //int root = 0;
        //for (int i = 1; i <= n; i++) {
        //    if (!parentsMap.containsKey(i)) {
        //        root = i;
        //        break;
        //    }
        //}

        // prepare indirect parents
        Map<Integer, Set<Integer>> indirectParentsMap = new HashMap<>();
        for (Map.Entry<Integer, Set<Integer>> entry : parentsMap.entrySet()) {
            Integer child = entry.getKey();
            for (Integer parent : entry.getValue()) {
                addParentParents(indirectParentsMap, parentsMap, child, parent);
            }
        }

        // detect unnecessary vector
        Map<Integer, Integer> parentMap = new HashMap<>();
        for (Map.Entry<Integer, Set<Integer>> entry : parentsMap.entrySet()) {
            Integer child = entry.getKey();
            Set<Integer> parents = entry.getValue();
            if (parents.size() == 1) {
                for (Integer parent : parents) {
                    parentMap.put(child, parent);
                }
                continue;
            }

            Set<Integer> indirectParents = indirectParentsMap.get(child);
            for (Integer parent : parents) {
                if (indirectParents.contains(parent)) {
                    // remove this path
                } else {
                    parentMap.put(child, parent);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (parentMap.containsKey(i)) {
                System.out.println(parentMap.get(i));
            } else {
                System.out.println(0);
            }
        }
    }

    private static void addParentParents(Map<Integer, Set<Integer>> indirectParentsMap,
            Map<Integer, Set<Integer>> parentsMap, Integer child, Integer parent) {
        Set<Integer> parentParents = parentsMap.get(parent);
        if (parentParents == null) {
            return;
        }

        Set<Integer> indirectParents = indirectParentsMap.get(child);
        if (indirectParents == null) {
            indirectParents = new HashSet<>();
            indirectParentsMap.put(child, indirectParents);
        }

        for (Integer parentParent : parentParents) {
            indirectParents.add(parentParent);
            addParentParents(indirectParentsMap, parentsMap, child, parentParent);
        }
    }
}
