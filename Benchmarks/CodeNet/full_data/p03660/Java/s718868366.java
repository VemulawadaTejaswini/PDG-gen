import java.util.*;
import java.io.*;


public class Main{

    public static Node[] nodes;
    public static ArrayList<Node> fennecCanColor, snukeCanColor;
    public static boolean[] colored;

    public static void main(String[] args) throws Exception{
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());

        nodes = new Node[n+1];
        colored = new boolean[n+1];
        fennecCanColor = new ArrayList<Node>();
        snukeCanColor = new ArrayList<Node>();

        for(int i = 1; i <= n; i++){
            nodes[i] = new Node();
            nodes[i].num = i;
        }

        colored[1] = true;
        colored[n] = true;

        for(int i = 1; i < n; i++){
            String[] input = in.readLine().split("\\s+");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            nodes[a].adjList.add(nodes[b]);
            nodes[b].adjList.add(nodes[a]);

            nodes[a].canColorSize++;
            nodes[b].canColorSize++;

            if(a == 1 || a == n){
                nodes[b].canColorSize--;
            }

            if(b == 1 || b == n){
                nodes[a].canColorSize--;
            }

            if(a == 1 && b != n){
                fennecCanColor.add(nodes[b]);
            }
            else if(a == n && b != 1){
                snukeCanColor.add(nodes[b]);
            }

            if(b == 1 && a != n){
                fennecCanColor.add(nodes[a]);
            }
            else if(b == n && a != 1){
                snukeCanColor.add(nodes[a]);
            }
        }

        Collections.sort(fennecCanColor);
        Collections.sort(snukeCanColor);

        boolean fennec = true;;

        while(play(fennec)){
            fennec = !fennec;
        }

        if(fennec){
            out.println("Snuke");
        }
        else{
            out.println("Fennec");
        }

        in.close();
        out.close();
    }

    public static boolean play(boolean fennec){
        if(fennec){
            return playFennec();
        }
        return playSnuke();
    }

    public static boolean playFennec(){

        int size = fennecCanColor.size();

        if(size == 0){
            return false;
        }

        boolean canColor = false;

        for(int i = 0; i < size; i++){
            Node tmpNode = fennecCanColor.get(i);
            if(snukeCanColor.contains(tmpNode)){
                //System.out.println("Fennec colors: " + tmpNode.num);
                colored[tmpNode.num] = true;
                fennecCanColor.remove(i);
                snukeCanColor.remove(tmpNode);
                canColor = true;
                addAdjList(tmpNode.num, true);
                break;
            }
        }

        if(!canColor){
            Node tmpNode = fennecCanColor.get(0);
            //System.out.println("Fennec colors: " + fennecCanColor.get(0).num);
            colored[tmpNode.num] = true;
            canColor = true;
            addAdjList(tmpNode.num, true);
            fennecCanColor.remove(0);
        }

        return canColor;
    }

    public static boolean playSnuke(){

        int size = snukeCanColor.size();

        if(size == 0){
            return false;
        }

        boolean canColor = false;

        for(int i = 0; i < size; i++){
            Node tmpNode = snukeCanColor.get(i);
            if(fennecCanColor.contains(tmpNode)){
                //System.out.println("Snuke colors: " + tmpNode.num);
                colored[tmpNode.num] = true;
                snukeCanColor.remove(i);
                fennecCanColor.remove(tmpNode);
                canColor = true;
                addAdjList(tmpNode.num, false);
                break;
            }
        }

        if(!canColor){
            Node tmpNode = snukeCanColor.get(0);
            //System.out.println("Snuke colors: " + snukeCanColor.get(0).num);
            colored[tmpNode.num] = true;
            canColor = true;
            addAdjList(tmpNode.num, false);
            snukeCanColor.remove(0);
        }

        return canColor;
    }

    public static void addAdjList(int num, boolean fennec){
        if(fennec){
            for(Node node : nodes[num].adjList){
                node.canColorSize--;
                if(!colored[node.num]){
                    //System.out.println("\tFennec adds: " + node.num);
                    fennecCanColor.add(node);
                }
            }
        }
        else{
            for(Node node : nodes[num].adjList){
                node.canColorSize--;
                if(!colored[node.num]){
                    //System.out.println("\tSnuke adds: " + node.num);
                    snukeCanColor.add(node);
                }
            }
        }

        Collections.sort(fennecCanColor);
        Collections.sort(snukeCanColor);
    }
}

class Node implements Comparable<Node> {

    public int num;
    public int canColorSize;
    public ArrayList<Node> adjList;

    public Node(){
        adjList = new ArrayList<Node>();
        canColorSize = 0;
    }

    @Override
    public int compareTo(Node n){
        return -1 * Integer.compare(this.canColorSize, n.canColorSize);
    }

}