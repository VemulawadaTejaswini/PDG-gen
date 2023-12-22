import java.util.*;
import java.io.*;

public class Main
{
  static int[] sum = new int[200000];
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(tokenizer1.nextToken());
    int q = Integer.parseInt(tokenizer1.nextToken());
    
    int[][] matrix = new int[n][n];
    int c1,c2;
    
    for(int i=0;i<n-1;i++)
    {
      StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());
       c1  = Integer.parseInt(tokenizer2.nextToken());
       c2 = Integer.parseInt(tokenizer2.nextToken());
      
      matrix[c1][c2] = 1;
    }
    
    
    for(int i=0;i<q;i++)
    {
       StringTokenizer tokenizer3 = new StringTokenizer(br.readLine());
       c1  = Integer.parseInt(tokenizer3.nextToken());
       c2 = Integer.parseInt(tokenizer3.nextToken());
       BFS(new Pair(c1,c2),matrix,n);
       
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(sum[i]+" ");
    }
  }
  
  public static void BFS(Pair pair,int[][] matrix,int size)
  {
     int source = pair.node;
     int value = pair.value;
     boolean[] visited = new boolean[matrix.length];
        visited[source-1] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
       // System.out.println("The breadth first order is");
        while(!queue.isEmpty()){
            //System.out.println(queue.peek());
            int x = queue.poll();
          	sum[x-1]+= value;
            int i;
            for(i=0; i<matrix.length;i++){
                if(matrix[x-1][i] == 1 && visited[i] == false){
                    queue.add(i+1);
                    visited[i] = true;
                }
            }
        }
      
    
  }
}

class Pair
{
  public int node;
  public int value;
  Pair(int node,int value)
  {
    this.node = node;
    this.value = value;
  }
}