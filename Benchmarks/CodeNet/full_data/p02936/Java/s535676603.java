import java.io.*;
import java.util.*;
class Main
{
    
    static class Node
    {
        int key;
        ArrayList<Node> adjacentChild;

        public Node(int key)
        {
            this.key=key;
            adjacentChild=new ArrayList<>();
        }
    }
  public static void main(String args[])throws Exception
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int q=Sc.nextInt();
    ArrayList<Node> nodes=new ArrayList<>();
    ArrayList<Integer> cost=new ArrayList<>(Collections.nCopies(n,0));
    for(int i=1;i<=n;i++)
    {
        Node a=new Node(i);
        nodes.add(a);
    }
    for(int i=1;i<=n-1;i++)
    {
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        nodes.get(a-1).adjacentChild.add(nodes.get(b-1));
    }
    for(int i=1;i<=q;i++)
    {
        int a=Sc.nextInt();
        int costs=Sc.nextInt();
        update(nodes.get(a-1),cost,costs);
    }
    for(int a:cost)
    System.out.print(a+" ");
  }
  static void update(Node a,ArrayList<Integer> cost,int costs)
  {
     int c=cost.get(a.key-1)+costs;
      cost.set(a.key-1,c);
     for(Node b:a.adjacentChild)
     {
        update(b,cost,costs);
     }
  }
}