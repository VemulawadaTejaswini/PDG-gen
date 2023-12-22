
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int cnt = 0;
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M  = sc.nextInt();

        boolean map[][] = new boolean[N][N];

        for(int i=0;i<M;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[x-1][y-1] = true;
            map[y-1][x-1] = true;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        dfsCount(map,stack);
        System.out.println(cnt);


        sc.close();
    }

    static void dfsCount(boolean [][] map , Stack<Integer> path ){
        int size = map.length;
        if (path.size()==size) {
            cnt++;
            return;
        }
        int peek = path.peek();
        for(int i =0;i<size;i++){
            if(map[peek][i]&&!path.contains(i)){
                Stack<Integer> sq = (Stack<Integer>)path.clone();
                sq.push(i);
                dfsCount(map,sq);
            }
        }
    }

}