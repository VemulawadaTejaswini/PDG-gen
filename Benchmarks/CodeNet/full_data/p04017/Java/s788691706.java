
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by jaga on 9/7/16.
 * 貪欲法で調べていく。が、全地点に関してそれをやると部分点解法だと思われる
 * dpで、ある地点からある地点にかかる日数を調べておく
 * dp[j][k] = j番目の地点からk番目の地点にかかる日数 INFで初期化 j <= k
 * dp[j][k] = Min(dp[j][k-1], dp[j][k-2], ,,, dp[j][k -10]) + 1;
 * 距離がLまでの以前の地点のうち、もっとも日数がかからない地点に+1した値
 * 貪欲法で考えるなら一番遠くの値
 * ただし、k - x >=j に注意しておく
 * これだとループを回す回数は 最大N ^ 2のオーダー
 *
 * MLEでた。dp[j][k]とdp[j-1][k]は全く関係ないので、底を考慮
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int  N,L, Q;
        int INF = 100000000;
        int x[];


        String line = br.readLine();
        N = Integer.parseInt(line);

        line = br.readLine();
        String text[] = line.split(" ");
        x = new int[N];
        for(int i = 0; i < N ; i++){
            x[i] = Integer.parseInt(text[i]);
        }

        ArrayList<Integer> q[] =new ArrayList[N];

        line = br.readLine();
        L  = Integer.parseInt(line);

        line = br.readLine();
        Q = Integer.parseInt(line);

        Node sum[] = new Node[Q];
        ArrayList<Node> idx[] = new ArrayList[N];

        for(int i = 0; i < N; i++){
            idx[i] = new ArrayList<Node>();
        }

        int aa,bb,min,max;
        for(int i = 0; i < Q; i++){
            line = br.readLine();
            text = line.split(" ");
            aa = Integer.parseInt(text[0]) - 1;
            bb = Integer.parseInt(text[1]) - 1;
            min = Math.min(aa, bb);
            max = Math.max(aa, bb);
            sum[i] = new Node(min,max);
            idx[min].add(sum[i]);
        }

        int dp[] = new int[N];

        //現在使用できる最も遠い地点を保管する
        PriorityQueue<Integer > que = new PriorityQueue<Integer>();

        loop:for(int i  =0 ; i < N ; i++){
            //出発点の座標
            int from = x[i];
            que.clear();
            que.add(i);

            //dpの初期化
            Arrays.fill(dp, INF);
            dp[i] = 0;

            for(int k = i + 1; k < N ; k++){
                int to = x[k];

                while(true){
                    //一番遠い地点がL圏内にくるまでpoll
                    if(to - x[que.peek()] > L){
                        que.poll();
                    }else{
                        break;
                    }
                }
                if(que.isEmpty())System.out.println("error");
                dp[k] =  dp[que.peek()] + 1;
                que.add(k);
            }
            if(!idx[i].isEmpty()){
                for(Node nd : idx[i]){
                    int k = nd.to;
                    nd.dis = dp[k];
                }
            }
        }
        for(int i = 0; i< Q ; i++){
            out.println(sum[i].dis);
        }
        out.flush();
    }
}

class Node {
    int from, to, dis; //dis = distance
    Node(int from, int to){

        this.from = from;
        this.to  = to;
    }
}