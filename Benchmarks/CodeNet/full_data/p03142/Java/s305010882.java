
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] pc = new int[n];
        int[] p = new int[n];
        ArrayList<Integer>[] a = new ArrayList[n];
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<n+m-1; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            pc[r] ++;
            if(a[l] == null) {
                a[l] = new ArrayList<Integer>();
            }
            ((ArrayList<Integer>)a[l]).add(r);
        }

        for(int i=0; i<n; i++) {
            if(pc[i] == 0 ) {
                p[i] = -1;
                q.add(i);
                break;
            }
        }

        while(!q.isEmpty()) {
            int x = q.poll();
            ArrayList<Integer> children = a[x];
            if(children == null) {
                continue;
            }
            for(int y : children) {
                pc[y]--;
                if(pc[y] == 0) {
                    p[y] = x;
                    q.offer(y);
                }
            }
        }

        for(int i=0; i<n; i++) {
            System.out.println(p[i]+1);
        }

    }


}
