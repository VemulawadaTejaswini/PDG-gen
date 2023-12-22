import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

//solution classes here

public class Main {

    //main solution here

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static long mod = (long)1e9+7;
    static long MOD = 998244353;
    //static ArrayList<Integer> list[] = new ArrayList[(int)1e6+1];
    //static int color[] = new int[(int)1e6+1];
    //static int visit[] = new int[(int)1e5+1];
    //static Deque<Integer> q = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        String s = sc.next();
        char ch[] = s.toCharArray();
        long ans=0;
        for(int i=0;i<n;i++) {
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i+1;j<n;j++) {
                if(ch[j]!=ch[i]) {
                    set1.add(j);
                }
            }
            for(int j=i-1;j>=0;j--) {
                if(ch[j]!=ch[i]) {
                    set2.add(j);
                    map.put(ch[j],map.getOrDefault(ch[j],0)+1);
                }
            }

            for(int it:set1) {
                ans+=set2.size();
                if(map.containsKey(ch[it])) {
                    ans-=map.get(ch[it]);
                }
                if(set2.contains(2*i-it)) {
                    if(ch[it]!=ch[2*i-it]) {
                        ans--;
                    }
                }
            }
        }

        out.println(ans);

        out.flush();
        out.close();
    }
    //solution functions here

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}

/* *****************************************************************************************************************************
 * I'M NOT IN DANGER, I'M THE DANGER!!!
 * *****************************************************************************************************************************
 */