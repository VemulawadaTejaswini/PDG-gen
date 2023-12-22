import java.util.*;

class Main{
    int N,u,v,A,B;

    class Node{
        ArrayList<Integer> edge = new ArrayList<Integer>();
        int aoki = -1;
    }

    Main(){
        Scanner SC = new Scanner(System.in);
        N = Integer.parseInt(SC.next());
        u = Integer.parseInt(SC.next())-1;
        v = Integer.parseInt(SC.next())-1;

        if(u == v){
            System.out.println(0);
            return;
        }

        Node[] nodes = new Node[N];
        for(int i=0;i<N;i++){
            nodes[i] = new Node();
        }

        for(int i=1;i<N;i++){
            A = Integer.parseInt(SC.next())-1;
            B = Integer.parseInt(SC.next())-1;

            nodes[A].edge.add(B);
            nodes[B].edge.add(A);
        }

        ArrayList<Node> openList = new ArrayList<Node>();
        nodes[v].aoki = 0;
        openList.add(nodes[v]);

        while(!openList.isEmpty()){
            Node n = openList.get(0);

            for(int i : n.edge){
                if(nodes[i].aoki == -1){
                    nodes[i].aoki = n.aoki + 1;
                    openList.add(nodes[i]);
                }
            }

            openList.remove(0);
        }


        openList.clear();
        openList.add(nodes[u]);
        int i = 0;
        int R = 0;
        while(!openList.isEmpty()){
            HashSet<Integer> temp = new HashSet<Integer>();

            while(!openList.isEmpty()){
                Node n = openList.get(0);
                int d = n.aoki - i;
                if(d == 0 || d == -1){
                    if(n.aoki > R) R = n.aoki;
                } else if(d > 0){
                    for(int e : n.edge){
                        temp.add(e);
                    }
                }
                openList.remove(0);
            }

            for(int t : temp){
                openList.add(nodes[t]);
            }
            i++;
        }

        System.out.println(R);
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
