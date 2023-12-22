import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok;

    public void go() throws IOException
    {
        ntok();
        int n = ipar();
        int h = ipar();
        int w = ipar();
        ArrayList<Card> cards = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            ntok();
            int r = ipar()-1;
            int c = ipar()-1;
            int val = ipar();
            Card card = new Card(i, r, c, val);
            cards.add(card);
        }
        Collections.sort(cards);
        UnionFind uf = new UnionFind(h+w);
        long sum = 0;
        for (Card card : cards)
        {
            if (uf.find(card.r) == uf.find(card.c+h))
            {
                if (!uf.locked[uf.find(card.r)])
                {
                    uf.locked[uf.find(card.r)] = true;
                    sum += card.val;
                }
            }
            else if (!uf.locked[uf.find(card.r)] || !uf.locked[uf.find(card.c+h)])
            {
                uf.union(card.r, card.c+h);
                sum += card.val;
            }
        }
        out.println(sum);

        out.flush();
        in.close();
    }

    private class Card implements Comparable<Card>
    {
        int i, r, c, val;

        public Card(int i, int r, int c, int v)
        {
            this.i = i;
            this.r = r;
            this.c = c;
            val = v;
        }

        public int hashCode()
        {
            return i;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof Card)
            {
                Card other = (Card)obj;
                return i == other.i;
            }
            return false;
        }

        public int compareTo(Card other)
        {
            if (val == other.val)
            {
                return Integer.compare(i, other.i);
            }
            return -Integer.compare(val, other.val);
        }
    }

    private class UnionFind
    {
        int[] arr;
        int[] sz;
        boolean[] locked;
        
        public UnionFind(int n)
        {
            arr = new int[n];
            sz = new int[n];
            locked = new boolean[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = i;
                sz[i] = 1;
            }
        }

        public int find(int i)
        {
            return arr[i] = (arr[i] == i ? i : find(arr[i]));
        }

        public void union(int i, int j)
        {
            i = find(i);
            j = find(j);
            if (sz[j] > sz[i])
            {
                int temp = i;
                i = j;
                j = temp;
            }
            arr[j] = i;
            sz[i] += sz[j];
            locked[i] |= locked[j];
        }
    }

    public void ntok() throws IOException
    {
        tok = new StringTokenizer(in.readLine());
    }

    public int ipar()
    {
        return Integer.parseInt(tok.nextToken());
    }

    public long lpar()
    {
        return Long.parseLong(tok.nextToken());
    }

    public double dpar()
    {
        return Double.parseDouble(tok.nextToken());
    }

    public String spar()
    {
        return tok.nextToken();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
