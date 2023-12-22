import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int root = 0;
        int ans = 0;
        if(n == 2){
            System.out.println(1);
            return;
        }
        Node[] node = new Node[n];
        for(int i=0; i<n; i++){
            node[i] = new Node();
        }

        for(int i=0; i<n-1; i++){
            int ma = sc.nextInt();
            int mb = sc.nextInt();
            node[ma].chi.add(mb);
            node[mb].chi.add(ma);
            if(node[ma].chi.size() >= 2) root = ma;
            if(node[mb].chi.size() >= 2) root = mb;
        }
        
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        queue.add(root);
        while(queue.size() != 0){
            int next = queue.poll();
            for(int i=0; i<node[next].chi.size(); i++){
                int mchi = node[next].chi.get(i);
                node[mchi].setpar(next);
                queue.add(mchi);
                stack.push(mchi);
            }
        }

        while(stack.size() != 0){
            int next = stack.poll();
            if(node[next].chi.size() > 0){
                node[next].an = true;
                continue;
            }

            if(count(node[next].par, node) > 1){
                node[next].an = true;
                ans++;
            }
        }

        if(ans >= 2){
            System.out.println(ans);
        }else{
            int num = 0;
            for(int i=0; i<n; i++){
                if(node[n].chi.size() >= 2) num++;
            }
            if(num == 1){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }

    }

    public static int count(int p, Node[] node){
        int mnum = 0;
        int msize = node[p].chi.size();
        for(int i=0; i<msize; i++){
            if(node[node[p].chi.get(i)].an){
                mnum++;
            }
        }
        return msize - mnum;
    }

    
}

class Node {
    public int par;
    public ArrayList<Integer> chi;
    public boolean an;

    public Node(){
        chi = new ArrayList<Integer>();
        an = false;
    }

    public void setpar(int p){
        par = p;
        chi.remove((Integer)p);
    }
}

