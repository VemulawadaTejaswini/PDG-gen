import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int dp[][];
    static int w;
    static int h;
    static int max = 0;
    static ArrayList<Integer> mhs;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
         h = sc.nextInt();
         w = sc.nextInt();
        int[][] board = new int[w][h];
        dp = new int[w][h];
        for (int y = 0;y < h;++y){
            for (int x = 0;x < w;++x){
                board[x][y] = sc.nextInt();
                dp[x][y] = Integer.MIN_VALUE;
            }
        }
        //search(0,0,board,0,new ArrayList<>());

        mhs = search(board);
        System.out.println(mhs.size() / 2);
        for (int i = 0;i < mhs.size() / 2;++i){
            int n1 = mhs.get(i * 2);
            int n2 = mhs.get(i * 2 + 1);
            int y1 = n1 / w;
            int x1 = (n1 - y1 * w);
            int y2 = n2 / w;
            int x2 = (n2 - y2 * w);
            StringBuilder sb = new StringBuilder();
            sb.append(y1 + 1);
            sb.append(' ');
            sb.append(x1 + 1);
            sb.append(' ');
            sb.append(y2 + 1);
            sb.append(' ');
            sb.append(x2 + 1);
            System.out.println(sb.toString());
        }

      /*  int c = 0;
        for (int y = 0;y < h;++y){
            for (int x = 0;x < w;++x){
                if((board[x][y] & 1) == 0){
                    ++c;
                }
            }
        }
        System.out.println(c);*/
    }

    public static ArrayList<Integer> search(int board[][]){
        ArrayList<Integer> hi = new ArrayList<>();
        for (int x = 0;x < w - 1;++x){
            if((board[x][0] & 1) == 1 && (board[x + 1][0] & 1) == 1){
                --board[x][0];
                ++board[x + 1][0];
                hi.add(x);
                hi.add(x + 1);
            }
        }
        for (int y = 1;y < h;++y){
            for (int x = 0;x < w;++x){
                if((board[x][y - 1] & 1) == 1){
                    --board[x][y - 1];
                    ++board[x][y];
                    hi.add(x + (y - 1) * h);
                    hi.add(x + y * h);
                }
            }
        }
        for (int x = 0;x < w - 1;++x){
            if((board[x][h - 1] & 1) == 1 && (board[x + 1][h - 1]) == 1){
                --board[x][h - 1];
                ++board[x + 1][h - 1];
                hi.add(x + (h - 1) * w);
                hi.add(x + 1 + (h - 1) * w);
            }
        }
        return hi;
    }

    public static void search(int x,int y,boolean board[],int c,ArrayList<Integer> hi){
        if(c <= dp[x][y])return;
        int i = x + w * y;
        if(x > 0){
            boolean[] b2 = board.clone();
            b2[i - 1] = !b2[i - 1];
            b2[i] = !b2[i];

            ArrayList<Integer> nh = new ArrayList<>(hi);
            nh.add(i);
            nh.add(i - 1);

            if(x + 1 < w){
                search(x + 1,y,b2,c,nh);
            }
            if(y + 1 < h){
                search(0,y + 1,b2,c,nh);
            }
        }
        if(y > 0){
            boolean[] b2 = board.clone();
            b2[i - w] = !b2[i - w];
            b2[i] = !b2[i];
            if(b2[i - w])++c;

            ArrayList<Integer> nh = new ArrayList<>(hi);
            nh.add(i);
            nh.add(i - w);

            if(x + 1 < w)search(x + 1,y,b2,c,nh);
            if(y + 1 < h)search(0,y + 1,b2,c,nh);
        }
        if(x + 1 < w){
            boolean[] b2 = board.clone();
            b2[i + 1] = !b2[i + 1];
            b2[i] = !b2[i];

            ArrayList<Integer> nh = new ArrayList<>(hi);
            nh.add(i);
            nh.add(i + 1);

            search(x + 1,y,b2,c,nh);
            if(y + 1 < h)search(0,y + 1,b2,c,nh);
        }
        if(y + 1 < h){
            boolean[] b2 = board.clone();
            b2[i + w] = !b2[i + w];
            b2[i] = !b2[i];

            ArrayList<Integer> nh = new ArrayList<>(hi);
            nh.add(i);
            nh.add(i + w);

            if(x + 1 < w)search(x + 1,y,b2,c,nh);
            if(y + 1 < h)search(0,y + 1,b2,c,nh);
        }
        if(x + 1 == w && y + 1 == h){
            int s = 0;
            for (int xx = 0;xx < w;++xx){
                for (int yy = 0;yy < h;++yy){
                    if(board[xx + w * yy])++s;
                }
            }
            if(max < s){
                max = s;
                mhs = hi;
            }
        }
    }

}


