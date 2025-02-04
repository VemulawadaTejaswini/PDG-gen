import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Node{
        List<Node> next=new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();// vertex
        int M = sc.nextInt(); // edges
        Node[] nodes = new Node[N];
        for (int i = 0; i < M ; i++) {
            int x  = sc.nextInt();
            int y  = sc.nextInt();
            if(nodes[x-1]==null){
                nodes[x-1]= new Node();
            }
            if(nodes[y-1]==null){
                nodes[y-1]= new Node();
            }
            Node node = nodes[x-1];
            node.next.add(nodes[y-1]);
        }


        int max =0;
        for (int i = 0; i < N  ; i++) {
//            System.out.println(nodes[i]);
            if(nodes[i] != null ){
                int res = longest(nodes[i],0);
//                System.out.println("i="+i+"  path="+res);
                if(res>max) max = res;
            }
        }

        System.out.println(max);
    }

    static int longest(Node root ,int  path){

        List<Node> list = root.next;
        if(list.size()==0) return path;
        int max =0;
        for(Node node: list){
            int pth = longest( node , path +1);
            if(pth>max) max = pth;
        }
        return max;
    }
}
