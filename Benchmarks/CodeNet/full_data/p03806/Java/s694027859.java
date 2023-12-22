
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Ma  = sc.nextInt();
        int Mb = sc.nextInt();

        Node[] map = new Node[N];

        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int v = sc.nextInt();
            Node node = new Node(x,y,v);
            map[i] = node;
        }

        int minCost = Integer.MAX_VALUE;
        long max = (long) Math.pow(2,N)-1;
        for(long i = 1;i<=max;i++){
            long tmp = i;
            int asum = 0;
            int bsum =0;
            int csum = 0;
            for(int j = 0;j<N;j++){
                if(tmp%2==1){
                    asum += map[j].a;
                    bsum += map[j].b;
                    csum += map[j].v;
                }
                tmp/=2;
            }
            if(asum*Mb==bsum*Ma){
                minCost = Math.min(minCost,csum);
            }
        }

        if(minCost==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(minCost);
        }


        sc.close();
    }

    static class Node{
        public int a;
        public int b;
        public int v;
        Node(int x, int y , int value){
            a = x;
            b = y;
            v = value;
        }

    }

}