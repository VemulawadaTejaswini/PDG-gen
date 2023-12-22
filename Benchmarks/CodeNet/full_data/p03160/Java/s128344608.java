import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static class Node implements Comparable<Atcoder_dp_A.Node>{
        int index;
        int cost;
        Node(int index,int cost){
            this.index = index;
            this.cost = cost;
        }
        public int compareTo(Atcoder_dp_A.Node other){
            if(this.cost == other.cost)
                return 0;
            else if(this.cost > other.cost)
                return 1;
            else
                return -1;
        }
    }
    public static void bfs(int[] arr){
        LinkedList<Atcoder_dp_A.Node> queue = new LinkedList<Atcoder_dp_A.Node>();
        LinkedList<Atcoder_dp_A.Node> res = new LinkedList<Atcoder_dp_A.Node>();
        queue.add(new Atcoder_dp_A.Node(0,0));
        while (!queue.isEmpty()){
            Atcoder_dp_A.Node current = queue.poll();
            if(current.index == arr.length-1){
                res.add(current);
            }
            if(current.index + 1 < arr.length){
                queue.add(new Atcoder_dp_A.Node(current.index+1,current.cost + Math.abs(arr[current.index+1] - arr[current.index])));
            }
            if(current.index+2 < arr.length){
                queue.add(new Atcoder_dp_A.Node(current.index+2,current.cost + Math.abs(arr[current.index+2] - arr[current.index])));
            }
        }
        Collections.sort(res);
        System.out.println(res.get(0).cost);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
        }
        bfs(arr);
    }
}
