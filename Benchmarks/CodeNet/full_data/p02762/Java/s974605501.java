import java.util.*;

class Main{
    Map<Integer, Integer> labelNum = new HashMap<Integer, Integer>();

    void search(Node node, int label){
        LinkedList<Node> open = new LinkedList<Node>();
        Set<Node>       close = new HashSet<Node>();

        open.add(node);

        while(!open.isEmpty()){
            Node n = open.getFirst();

            for(Node i : n.friend){
                if(!close.contains(i)){
                    open.add(i);
                }
            }

            n.label = label;

            open.remove(n);
            close.add(n);
        }

        labelNum.put(label, close.size());
    }

    Main(){
        Scanner SC = new Scanner(System.in);
        int N = Integer.parseInt(SC.next());
        int M = Integer.parseInt(SC.next());
        int K = Integer.parseInt(SC.next());

        Node[] nodes = new Node[N];
        for(int i=0;i<N;i++){
            nodes[i] = new Node();
        }

        for(int i=0;i<M;i++){
            int A = Integer.parseInt(SC.next())-1;
            int B = Integer.parseInt(SC.next())-1;

            nodes[A].addFriend(nodes[B]);
            nodes[B].addFriend(nodes[A]);
        }

        for(int i=0;i<K;i++){
            int C = Integer.parseInt(SC.next())-1;
            int D = Integer.parseInt(SC.next())-1;

            nodes[C].addBlock(nodes[D]);
            nodes[D].addBlock(nodes[C]);
        }

        int label = 0;
        for(int i=0;i<N;i++){
            if(nodes[i].label < 0){
                search(nodes[i], label);
                label++;
            }
        }

        for(int i=0;i<N;i++){
            int R = labelNum.get(nodes[i].label) - 1;
            for(Node j : nodes[i].block){
                if(j.label == nodes[i].label){
                    R--;
                }
            }
            R -= nodes[i].friend.size();
            System.out.print(R + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        Main main = new Main();
    }

    class Node{
        int label = Integer.MIN_VALUE;

        List<Node> friend  = new LinkedList<Node>();
        List<Node> block   = new LinkedList<Node>();

        void addFriend(Node node){
            friend.add(node);
        }

        void addBlock(Node node){
            block.add(node);
        }
    }

}
