import java.util.*;
import java.io.*;


class Main{


    public static int BFS(LinkedList<Integer>[] adjList){

        int[] dist = new int[adjList.length];
        int maxSoFar = 0;

        for(int i = 1; i < adjList.length; i++){
            
            Queue<Integer> q = new LinkedList<>();

            q.add(i);
            dist[i] = 0;

            while(!q.isEmpty()){
                int parent = q.poll();
                Iterator<Integer> iter = adjList[parent].iterator();
                while(iter.hasNext()){
                    int child = iter.next();
                    dist[child] = dist[parent] + 1;
                    maxSoFar = Math.max(maxSoFar, dist[child]);
                    q.add(child);
                }
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        LinkedList<Integer>[] adjList = new LinkedList[n + 1];
        for(int i = 1; i <= n; i++) adjList[i] = new LinkedList<>();

        for(int i = 0; i < m; i++){
            int from = in.nextInt();
            int to = in.nextInt();
            adjList[from].add(to);
        }

        System.out.println(BFS(adjList));
    }

}