import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static boolean debug = true;
    public static HashMap<Integer,Integer> scoremap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[][] input = new int[n-1][2];
        for(int i=0; i<n-1;i++){
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
        }

        for (int i=0;i<q;i++){
            int no = sc.nextInt();
            int score = sc.nextInt();
            if(scoremap.containsKey(no)){
                scoremap.put(no,scoremap.get(no)+score);
            }else{
                scoremap.put(no,score);
            }
        }

        int rscore = 0;
        if(scoremap.containsKey(1)){
            rscore = scoremap.get(1);
        }
        Node root = new Node(1,rscore,scoremap);
        for(int i=0; i<n-1;i++){
            int parent = input[i][0];
            int child = input[i][1];
            root.add(parent,child);
        }

        //System.out.println(root.toString(1));

        int[] result = new int[root.nodecount()];

        root.getResult(result,0);
        StringBuilder builder = new StringBuilder();
        for(int temp :result){
            builder.append(temp + " ");
        }
        System.out.print(builder.toString());

    }

}

class Node{
    int no = 0;
    int score = 0;
    ArrayList<Node> list = new ArrayList<Node>();
    HashMap<Integer,Integer> scoreMap;
    public Node(int no,int score,HashMap<Integer,Integer> scoreMap){
        this.no = no;
        this.score = score;
        this.scoreMap = scoreMap;
    }
    public void addScore(int score){
        this.score += score;
    }
    public void add(Node node){
        list.add(node);
    }

    public void add(int to , int child){
        if(this.no == to){
            int score = 0;
            if(scoreMap.containsKey(child)){
                score = scoreMap.get(child);
            }
            list.add(new Node(child,score,scoreMap));
        }else{
            for(Node node:list){
                node.add(to,child);
            }
        }
    }

    public void getResult(int[] result, int parentscore){
        score += parentscore;
        result[no-1] = score;
        for(Node n:list) {
            n.getResult(result,score);
        }
    }

    public int nodecount(){
        int count = 1;
        for(Node n : list){
            count += n.nodecount();
        }
        return count;
    }

    public String toString(int r){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(no + ":" + score);
        stringBuffer.append("[");

        StringBuilder builder = new StringBuilder();
        for(int i=0;i<r;i++){
            builder.append("\t");
        }
        String tabs = builder.toString();

        for(Node node:list){
            stringBuffer.append("\n" + tabs);
            stringBuffer.append(node.toString(r+1));
        }
        stringBuffer.append("]");

        return stringBuffer.toString();
    }

}