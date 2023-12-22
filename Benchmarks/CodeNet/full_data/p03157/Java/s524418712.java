
import java.util.AbstractMap;
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
                Queue<Pair<Integer,Integer>> q=new ArrayBlockingQueue<Pair<Integer,Integer>>(H*W);
                q.add(new Pair<Integer,Integer>(i,j));
                f[i][j]=true;
                long sharp =0;
                long dot=0;
                while(!q.isEmpty()) {
                	Pair<Integer,Integer> p=q.poll();
                	int h=p.getKey();
                	int w=p.getValue();
                	char c=g[h][w];
                	if(c=='#') {
                		sharp++;
                	} else {
                		dot++;
                	}
                	if (h-1>=0 && f[h-1][w]==false && c!=g[h-1][w]) {
                		f[h-1][w]=true;
                		q.add(new Pair<Integer,Integer>(h-1,w));
                	}
                	if (w+1<W && f[h][w+1]==false && c!=g[h][w+1]) {
                		f[h][w+1]=true;
                		q.add(new Pair<Integer,Integer>(h,w+1));
                	}
                	if (h+1<H && f[h+1][w]==false && c!=g[h+1][w]) {
                		f[h+1][w]=true;
                		q.add(new Pair<Integer,Integer>(h+1,w));
                	}
                	if (w-1>=0 && f[h][w-1]==false && c!=g[h][w-1]) {
                		f[h][w-1]=true;
                		q.add(new Pair<Integer,Integer>(h,w-1));
                	}
                }
                ans+=sharp*dot;
            }
        }

        System.out.println(ans);
    }

    public static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> implements Comparable<Pair<K, V>> {
        /** serialVersionUID. */
        private static final long serialVersionUID = 6411527075103472113L;

        public Pair(final K key, final V value) {
            super(key, value);
        }

        @Override
        public int compareTo(Pair<K, V> o) {

            Comparable key = (Comparable)this.getKey();
            Comparable key2 = (Comparable)o.getKey();

            return key.compareTo(key2);
        }

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