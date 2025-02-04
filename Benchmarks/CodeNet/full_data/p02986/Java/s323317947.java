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

        Cell[] cells = new Cell[N + 1];
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

            if (cells[a] == null) {
                cells[a] = new Cell(a, N - 1);
            }

            if (cells[b] == null) {
                cells[b] = new Cell(b, N - 1);
            }

            ac = cells[a];
            bc = cells[b];

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
            uc = cells[u];
            System.out.println(search(uc, new int[N], v, x, y, 0));
        }

        sc.close();
    }

    public static final int FAILED = -1;

  public static int search(Cell now, int[] counted, int target, int x, int y, int total){
    if(now.getNum() == target){
      return total;
    }
    
    if(counted[now.getNum()] == FAILED){
      return FAILED;
    }
    
    //keep
    int[] _counted = counted.clone();
    int _total = total;
    int s = 0;
    int count = now.getNodeCount();
    for(int nodeIndex = 0; nodeIndex < count; nodeIndex++){
      Node node = now.getNode(nodeIndex);
      Cell next = node.getTheOther(now);
    
      counted[now.getNum()] = FAILED;
    
      total += node.getColor() == x ? y : node.getDistance();
      if((s = search(next, counted, target, x, y, total)) != FAILED){
        return s;
      }else{
        counted = _counted.clone();
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
        private int[] connected;
        private int num;

        public Cell(int num, int len) {
            this.num = num;
            this.connected = new int[len];
        }

        public void connect(Node node) {
            this.connected[this.connected.length - 1] = node;
        }

        public Node getNode(int index) {
            return this.connected[index];
        }

        public int getNum() {
            return this.num;
        }

        public int getNodeCount() {
            return this.connected.length;
        }
    }
}