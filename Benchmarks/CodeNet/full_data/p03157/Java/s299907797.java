

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int H=gi();
        int W=gi();
        char[][] g=new char[H][W];
        boolean[][] f=new boolean[H][W];

        for (int i=0; i<H;i++) {
            String s=gs();
        	for (int j=0; j<W;j++) {
                char c=s.charAt(j);
                g[i][j]=c;
            }
        }
        long ans=0;
        for (int i=0; i<H;i++) {
        	for (int j=0; j<W;j++) {
        		if(f[i][j]) continue;
                Queue<Integer> q=new ArrayBlockingQueue<Integer>(H*W);
                Queue<Integer> q2=new ArrayBlockingQueue<Integer>(H*W);
                q.add(i);
                q2.add(i);
                f[i][j]=true;
                long sharp =0;
                long dot=0;
                while(!q.isEmpty()) {
                	int h=q.poll();
                	int w=q2.poll();
                	char c=g[h][w];
                	if(c=='#') {
                		sharp++;
                	} else {
                		dot++;
                	}
                	if (h-1>=0 && f[h-1][w]==false && c!=g[h-1][w]) {
                		f[h-1][w]=true;
                		q.add(h-1);
                		q2.add(w);
                	}
                	if (w+1<W && f[h][w+1]==false && c!=g[h][w+1]) {
                		f[h][w+1]=true;
                		q.add(h);
                		q2.add(w+1);
                	}
                	if (h+1<H && f[h+1][w]==false && c!=g[h+1][w]) {
                		f[h+1][w]=true;
                		q.add(h+1);
                		q2.add(w);
                	}
                	if (w-1>=0 && f[h][w-1]==false && c!=g[h][w-1]) {
                		f[h][w-1]=true;
                		q.add(h);
                		q2.add(w-1);
                	}
                }
                ans+=sharp*dot;
            }
        }

        System.out.println(ans);
    }
    // 文字列として入力を取得
    public static String gs() {
         return scanner.next();
    }

    // intとして入力を取得
    public static int gi() {
         return Integer.parseInt(scanner.next());
    }

    // longとして入力を取得
    public static long gl() {
         return Long.parseLong(scanner.next());
    }

    // doubleとして入力を取得
    public static double gd() {
         return Double.parseDouble(scanner.next());
    }
}