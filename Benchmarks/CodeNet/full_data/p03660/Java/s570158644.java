import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception{
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());

        Node[] nodes = new Node[n];
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++){
            nodes[i] = new Node();
            nodes[i].num = i;
        }
        nodes[0].isBlack = true;
        nodes[n-1].isWhite = true;

        for(int i = 1; i < n; i++){
            String[] input = in.readLine().split("\\s+");
            int a = Integer.parseInt(input[0]) - 1;
            int b = Integer.parseInt(input[1]) - 1;

            nodes[a].adjList.add(nodes[b]);
            nodes[b].adjList.add(nodes[a]);

            if(a == 0){
                nodes[b].canBeBlack = true;
            }
            else if(a == n-1){
                nodes[b].canBeWhite = true;
            }

            if(b == 0){
                nodes[a].canBeBlack = true;
            }
            else if(b == n-1){
                nodes[a].canBeWhite = true;
            }
        }

        Arrays.sort(nodes);

        boolean fennec = false;
        boolean stop = false;

        do{
            fennec = !fennec;
            stop = false;
            boolean canColor = false;
            if(fennec){
                for(int i = 0; i < n; i++){
                    if(!visited[nodes[i].num] && nodes[i].canBeBlack){
                        canColor = true;
                        visited[nodes[i].num] = true;
                        for(Node node : nodes[i].adjList){
                            if(!visited[node.num]){
                                node.canBeBlack = true;
                            }
                        }
                        break;
                    }
                }
                stop = !canColor;
            }
            else{
                for(int i = 0; i < n; i++){
                    if(!visited[nodes[i].num] && nodes[i].canBeWhite){
                        canColor = true;
                        visited[nodes[i].num] = true;
                        for(Node node : nodes[i].adjList){
                            if(!visited[node.num]){
                                node.canBeWhite = true;
                            }
                        }
                        break;
                    }
                }
                stop = !canColor;
            }
            
        }while(!stop);

        if(fennec){
            out.println("Snuke");
        }
        else{
            out.println("Fennec");
        }

        in.close();
        out.close();
    }
}

class Node implements Comparable<Node> {

    public int num;
    public boolean isBlack, isWhite, canBeBlack, canBeWhite;
    public ArrayList<Node> adjList;

    public Node(){
        adjList = new ArrayList<Node>();
    }

    @Override
    public int compareTo(Node n){
        return -1 * Integer.compare(this.adjList.size(), n.adjList.size());
    }

}