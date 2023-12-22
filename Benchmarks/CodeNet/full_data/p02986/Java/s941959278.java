import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        Scanner sc = new Scanner(System.in);

        String[] NQ = sc.nextLine().split(" ");
        int N = Integer.parseInt(NQ[0]);
        int Q = Integer.parseInt(NQ[1]);

        HashMap<Integer, Cell> cells = new HashMap<Integer, Cell>();
        String[] abcd;
        int a, b, c, d;
        Cell ac, bc;
        Node node;
        for (int i = 1; i <= N - 1; ++i) {
            abcd = sc.nextLine().split(" ");
            a = Integer.parseInt(abcd[0]);
            b = Integer.parseInt(abcd[1]);
            c = Integer.parseInt(abcd[2]);
            d = Integer.parseInt(abcd[3]);

            if (cells.get(a) == null) {
                cells.put(a, new Cell(a));
            }

            if (cells.get(b) == null) {
                cells.put(b, new Cell(b));
            }

            ac = cells.get(a);
            bc = cells.get(b);

            node = new Node(ac, bc, c, d);
            ac.connect(node);
            bc.connect(node);
        }

        int x, y, u, v;
        Cell uc;
        String[] xyuv;
        for (int j = 1; j <= Q; ++j) {
            xyuv = sc.nextLine().split(" ");
            x = Integer.parseInt(xyuv[0]);
            y = Integer.parseInt(xyuv[1]);
            u = Integer.parseInt(xyuv[2]);
            v = Integer.parseInt(xyuv[3]);
            uc = cells.get(u);
            System.out.println(search(uc, new ArrayList<Cell>(), v, x, y, 0));
        }

        sc.close();
    }

    public static final int FAILED = -1;

  public static int search(Cell now, ArrayList<Cell> counted, int target, int x, int y, int total){
    if(now.getNum() == target){
      return total;
    }
    
    if(counted.contains(now)){
      return FAILED;
    }
    
    //keep
    ArrayList<Cell> _counted = counted;
    int _total = total;
    int s = 0;
    for(int nodeIndex = 0; nodeIndex < now.getNodeCount(); nodeIndex++){
      Node node = now.getNode(nodeIndex);
      Cell next = node.getTheOther(now);
    
      counted.add(now);
    
      total += node.getColor() == x ? y : node.getDistance();
      if((s = search(next, counted, target, x, y, total)) != FAILED){
        return s;
      }else{
        counted = _counted;
        total = _total;
        continue;
      } 
    }

    return FAILED;
  }

    private class Node {
        private Cell a, b;
        private int color, distance;

        public Node(Cell a, Cell b, int color, int distance) {
            this.a = a;
            this.b = b;
            this.color = color;
            this.distance = distance;
        }

        public Cell getTheOther(Cell c) {
            if (a.getNum() == c.getNum()) {
                return this.b;
            } else if (b.getNum() == c.getNum()) {
                return this.a;
            }
            return null;
        }

        public int getColor() {
            return this.color;
        }

        public int getDistance() {
            return this.distance;
        }
    }

    private class Cell {
        private ArrayList<Node> connected = new ArrayList<Node>();
        private int num;

        public Cell(int num) {
            this.num = num;
        }

        public void connect(Node node) {
            connected.add(node);
        }

        public Node getNode(int index) {
            return this.connected.get(index);
        }

        public int getNum() {
            return this.num;
        }

        public int getNodeCount() {
            return this.connected.size();
        }
    }
}