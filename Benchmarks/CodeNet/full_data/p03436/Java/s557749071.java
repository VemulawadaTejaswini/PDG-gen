import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {
    static String[][] map = new String[50][50];
    static int H;
    static int W;
    static int ans = -1;

    static class pair {
            public int a;
            public int b;
            public int n;

            pair(){
                this.a = 0;
                this.b = 0;
                this.n = 0;
            }

            pair(int a, int b, int n){
                this.a = a;
                this.b = b;
                this.n = n;
            }

            public void set(int a, int b, int n) {
                this.a = a;
                this.b = b;
                this.n = n;
            }

        @Override
        public String toString() {
            return this.a + ":" + this.b + ":" + this.n;
        }
    }

   static  ArrayList<pair> q = new ArrayList();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        H = scanner.nextInt();
        W = scanner.nextInt();
        int cnt = 0;

        for (int i = 0; i < H; i++) {
            map[i] = scanner.next().split("");
            for (int j = 0; j < W; j++) {
                if(map[i][j].equals("."))cnt++;
            }
        }

        q.add(new pair(0, 0, 1));
        iter();

        if(ans != -1) {
            System.out.println(cnt - ans);
        }else{
            System.out.println(-1);
        }
    }

    static public void iter() {


        while (q.size() > 0 && ans == -1) {
            pair now = q.get(0);q.remove(0);




            if(now.a == W - 1 && now.b == H - 1){
                ans = now.n;
                continue;
            }



            int[] dx = {1, -1, 0, 0};
            int[] dy = {0, 0, 1, -1};

            for (int i = 0; i < 4; i++) {
                int xx = now.a + dx[i];
                int yy = now.b + dy[i];

                if (xx >= 0 && xx < W && yy >= 0 && yy < H) {
                    if(map[yy][xx].equals(".")) {
                        map[yy][xx] = "#";
                        q.add(new pair(xx, yy, now.n + 1));
                    }

                }
            }
        }

    }


}


