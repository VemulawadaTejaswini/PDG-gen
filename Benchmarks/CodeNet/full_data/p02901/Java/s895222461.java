import java.util.*;

class MinCostProblem {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int noofboxes = scanner.nextInt();
        int noofkeys = scanner.nextInt();
        int keycost[] = new int[noofkeys];
        Map<Integer, List<Integer>> costvsboxesmap = new TreeMap<>();
        for (int i=0; i<noofkeys; i++) {
//            System.out.println("Getting key - "+ i);
            keycost[i] = scanner.nextInt();
            int boxnos = scanner.nextInt();
            List<Integer> boxlist = new ArrayList<>();
            for (int j=0; j<boxnos; j++) {
//                System.out.println("Getting box nos - "+ j);
                boxlist.add(scanner.nextInt());
                costvsboxesmap.put(keycost[i], boxlist);
            }
        }

        int costcompute = 0; Set<Integer> boxesset = new HashSet<>();
        Iterator<Map.Entry<Integer, List<Integer>>> costboxiterator = costvsboxesmap.entrySet().iterator();
        Map.Entry<Integer, List<Integer>> entry = null;

        while(costboxiterator.hasNext()) {
            entry = costboxiterator.next();
            Integer cost = entry.getKey();
            List<Integer> boxes = entry.getValue();

            if (boxesset.addAll(boxes)) {
                costcompute += cost;
            }
        }

        if (boxesset.size() != noofboxes) {
            costcompute = -1;
        }

        System.out.println(costcompute);
    }
}
