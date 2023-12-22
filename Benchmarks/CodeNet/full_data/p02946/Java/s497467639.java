import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {

    private static List<List<Integer>> subsets;
    private static int count = 0;
    private static BigInteger thirteen = new BigInteger("13");
    private static BigInteger five = new BigInteger("5");
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        int k = in.nextInt();
        int x = in.nextInt();
        for (int i = x-k + 1; i < k+x; i++) {
            out.print(i+" ");
        }
        out.println();
        out.flush();
    }
    private static void dfs(int[][] grid, int i, int j, boolean[][] visited, boolean[][] changed) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        if(grid[i][j] == 1) {
            if(!isBorder(grid,i,j,changed)) {
                grid[i][j] = 0;
                changed[i][j] = true;
            }
        }
        dfs(grid,i+1,j,visited,changed);
        dfs(grid,i-1,j,visited,changed);
        dfs(grid,i,j + 1,visited,changed);
        dfs(grid,i,j - 1,visited,changed);
    }
    static boolean isBorder(int [][] grid, int i, int j, boolean[][] changed) {
        if (i - 1 < 0) return true;
        if (i + 1 == grid.length) return true;
        if (j - 1 < 0) return true;
        if (j + 1 == grid[0].length) return true;
        if(grid[i-1][j-1] == 0 && !changed[i-1][j-1]) return true;
        if(grid[i-1][j] == 0 && !changed[i-1][j]) return true;
        if(grid[i+1][j] == 0 && !changed[i+1][j]) return true;
        if(grid[i][j-1] == 0 && !changed[i][j-1]) return true;
        if(grid[i][j+1] == 0 && !changed[i][j+1]) return true;
        return false;
    }
    static boolean check(int [][] grid, int i, int j) {
        return i>=0 && j>=0 && i < grid.length && j<grid[0].length;
    }
    static int toDecany(String s) {
        char [] c = s.toCharArray();
        int ans = 0;
        int k = 0;
        for (int i = c.length - 1; i >=0; i--) {
            int value = (c[i]-'0');
            ans+=value*Math.pow(2,k++);
        }
        return ans;
    }

    static void generate(char [] c, int index) {
        if(index == c.length) {
            BigInteger b = new BigInteger(new String(c));
            if(b.mod(thirteen).equals(five)) {
                count = (count + 1)%1000000007;
            }
            return;
        }
        if(c[index] == '?') {
            for (char i = '0'; i <= '9'; i++) {
                if(c[index] == '?') {
                    c[index] = i;
                    generate(c, index + 1);
                    c[index] = '?';
                }
            }
        }
        else {
            generate(c,index + 1);
        }



    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        HashMap<Integer,Set<Integer>> map = mapToDislikes(dislikes);
        HashSet<Integer> first = new HashSet<>();
        HashSet<Integer> second = new HashSet<>();
        for(Map.Entry<Integer,Set<Integer>> m : map.entrySet()) {
            Set<Integer> set = m.getValue();
            boolean found = false;
            for(int i : set) {
                if(first.contains(i)) {
                    found = true;
                    break;
                }
            }
            if(!found) first.add(m.getKey());
            else {
                found = false;
                for(int i : set) {
                    if(second.contains(i)) {
                        found = true;
                        break;
                    }
                }
                if(found) return true;
                else second.add(m.getKey());
            }
        }
        return true;
    }
    private HashMap<Integer,Set<Integer>> mapToDislikes(int [][] dislakes) {
        HashMap<Integer,Set<Integer>> map = new HashMap<>();
        for(int [] i : dislakes) {
            addToMap(i[0],i[1],map);
            addToMap(i[1],i[0],map);
        }
        return map;
    }
    private void addToMap(int key, int value, HashMap<Integer,Set<Integer>> map) {
        Set<Integer> set;
        if(map.containsKey(key)) {
            set = map.get(key);
        }
        else {
            set = new HashSet<>();
        }
        set.add(value);
        map.put(key,set);
    }
    static int toBinary(int n) {
        String  s = Integer.toBinaryString(n);
        return Integer.parseInt(s);
    }
    static int numberOfDigits(int n) {
        int count = 0;
        while (n>0) {
            n/=10;
            count++;
        }
        return count;
    }
    static int gcd(int a,int b) {
        return b == 0 ? a : gcd(b,a%b);
    }
    static char [] convert(char [] c) {
        for (int i = 0; i < c.length; i++) {
            char current = c[i];
            if (current == '9') {
                c[i] = '0';
            }
            else {
                c[i] = ++c[i];
            }
        }
        return c;
    }
    static char [] shift(char [] c) {
        char temp = c[c.length - 1];
        for (int i = 0; i < c.length;i++) {
            char current = c[i];
            c[i] = temp;
            temp = current;
        }
        c[0] = temp;
        return c;
    }
    static void subsets(int [] a, int index, List<Integer> list) {
        subsets.add(new ArrayList<>(list));
        for (int i = index; i < a.length; i++) {
            list.add(a[i]);
            subsets(a,i+1,list);
            list.remove(list.size() - 1);
        }
    }
    static long sum(long n) {
        return n*(n+1)/2;
    }

    static int lcm(int a,int b,int gcd) {
        return a*b/gcd;
    }

}
class Point {
    int x;
    int y;
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
class InputReader extends BufferedReader {
    StringTokenizer tokenizer;

    public InputReader(InputStream inputStream) {
        super(new InputStreamReader(inputStream), 32768);
    }

    public InputReader(String filename) {
        super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(filename)));
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return tokenizer.nextToken();
    }
    public Integer nextInt() {return Integer.valueOf(next());}
    public Long nextLong() {return  Long.valueOf(next());}
    public Double nextDouble() {return Double.valueOf(next());}

    static class OutputWriter extends PrintWriter {
        public OutputWriter(OutputStream outputStream) {
            super(outputStream);
        }

        public OutputWriter(Writer writer) {
            super(writer);
        }

        public OutputWriter(String filename) throws FileNotFoundException {
            super(filename);
        }

        public void close() {
            super.close();
        }
    }
}