import java.util.*;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Map<Integer, Node> maps = new HashMap<>();
        List<Integer> keyList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        for(int i= 0; i < N-1; i++) {
            int parent = scanner.nextInt();
            int child = scanner.nextInt();
            Node p, c;
            if(!maps.containsKey(parent)){
                p = new Node();
                maps.put(parent, p);
                keyList.add(parent);
            }else {
                p = maps.get(parent);
            }
            if(!maps.containsKey(child)){
                c = new Node();
                maps.put(child, c);
                keyList.add(child);
            }else {
                c = maps.get(child);
            }
            p.setChild(c);
        }
        Map<Integer, Integer> ope = new HashMap<>();
        for(int i = 0; i < Q; i++) {
            int point = scanner.nextInt();
            int val = scanner.nextInt();
            if(ope.containsKey(point)) {
                ope.put(point, val + ope.get(point));
            }else {
                ope.put(point, val);
            }
        }

        for(Map.Entry<Integer, Integer> op : ope.entrySet()) {
            Node root = maps.get(op.getKey());
            plus(root, op.getValue());
        }


        keyList.sort(Integer::compareTo);
        for(Integer key : keyList){
            Node a = maps.get(key);
            System.out.print( a.data + " ");
        }

    }

    private void plus(Node node, int val) {
        node.data += val;
        for(Node c : node.children) {
            plus(c, val);
        }
    }

    public class Node {
        public int data;
        public List<Node> children;

        Node() {
            this.data = 0;
            this.children = new ArrayList<>();
        }
        public void setChild(Node c) {
            this.children.add(c);
        }

    }
}