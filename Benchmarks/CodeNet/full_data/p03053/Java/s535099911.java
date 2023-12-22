import java.util.*;
import java.io.*;

class Solution{
    static int n,m;
    static boolean isvisited[][];
    public static boolean check(int i,int j){
        if(i<1 || i>n)
            return false;
        if(j<1 || j>m)
            return false;
        return !isvisited[i][j];
    }
    public static void main(String args[])throws IOException{
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        char arr[][]=new char[n+1][m+1];
        int i,j;
        isvisited=new boolean[n+1][m+1];
        Queue<Node> queue=new LinkedList<>();
        for(i=1;i<=n;i++){
            String s=in.next();
            for(j=1;j<=m;j++){
                arr[i][j]=s.charAt(j-1);
                if(arr[i][j]=='#'){
                    isvisited[i][j]=true;
                    queue.add(new Node(i,j));
                }

            }
        }
        int cost=0,x=queue.size(),p=0,l,r;
        Node n;
        int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};
        //System.out.println("HYY");
        while(!queue.isEmpty()){
            n=queue.poll();
            for(i=0;i<4;i++){
                l=n.i+dir[i][0];
                r=n.j+dir[i][1];
                if(check(l,r)){
                    queue.add(new Node(l,r));
                    isvisited[l][r]=true;

                }
            }
            p++;
            //System.out.println(n.i+" "+n.j+" "+cost+" "+x+" "+p);
            if(p==x){
                cost++;
                p=0;
                x=queue.size();
            }


        }
        System.out.println(cost-1);



    }
}
class Node{
    int i, j;
    public Node(int i,int j){
        this.i=i;
        this.j=j;
    }
}