import java.util.*;

public class Main {

    public static void main(String[] args) {
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);

        Scanner sc = new Scanner(System.in);
//        int N = ni();
        int N = sc.nextInt();
//        int Q = ni();
        int Q = sc.nextInt();

        int[][] constructs = new int[N][4];
        for (int i = 0; i < N; i++) {
//            int s = ni();
//            int t = ni();
//            int x = ni();
            int s = sc.nextInt();
            int t = sc.nextInt();
            int x = sc.nextInt();
            constructs[i]=new int[]{x ,s-x, t-x,i};
        }

        Arrays.sort(constructs, new Comparator<int[]>() { // sort construcions by start date
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });


        TreeSet<int[]> sortedByEndTime= new TreeSet<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] ==o2[2]?o1[3] - o2[3]:o1[2] - o2[2];
            }
        });
        TreeSet<int[]> sortedByDistance= new TreeSet<>( (o1,o2) -> o1[0]==o2[0]?o1[3]-o2[3]:o1[0]-o2[0]);


        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < Q; i++) {

//            int d = ni();
            int d = sc.nextInt();
            while(idx < constructs.length && constructs[idx][1] <= d ){ //  Starttme <= d
                sortedByEndTime.add(constructs[idx]);
                sortedByDistance.add(constructs[idx]);
                idx++;
            }

            while( !sortedByEndTime.isEmpty() &&  sortedByEndTime.first()[2] <= d ) { //  Endttme >= d remove
                int[]  construct = sortedByEndTime.pollFirst();
                sortedByDistance.remove(construct);
            }

            if(sortedByDistance.isEmpty()){
                sb.append(-1).append('\n');
//                System.out.println("-1");
            }else{
                int[] closestConstru = sortedByDistance.first();
                sb.append(closestConstru[0]).append('\n');
//                System.out.println(closestConstru[0]);
            }
//            sortedByDistance.clear();
//            sortedByEndTime.clear();
        }

        System.out.println(sb.toString());


//
//        TreeSet<Pair> people = new TreeSet<>();
//        for (int i = 0; i < Q; i++) {
//            people.add(new Pair(sc.nextInt(),i));//sorted
//        }
//
//        int[] ans = new int[Q];
//        //check the person with contruction and if hits delete and memo index
//        for(Trio constr : constructs){
//            SortedSet<Pair> lower_bound = people.tailSet(new Pair(constr.s,-1));
//            Iterator<Pair> it = lower_bound.iterator();
//            while(it.hasNext()){
//                    Pair person = it.next();
//                    if(person.d >= constr.t ) break;
//                    ans[person.idx]= constr.x;
//                    it.remove();
//            }
//        }
//        for(int dis:ans){
//            System.out.println(dis==0?"-1":dis);
//        }
    }

    private static java.io.InputStream is = System.in;
    private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
    private static java.util.StringTokenizer tokenizer = null;
    private static java.io.BufferedReader reader;

    public static String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new java.util.StringTokenizer(reader.readLine());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    private static double nd() {
        return Double.parseDouble(next());
    }

    private static long nl() {
        return Long.parseLong(next());
    }

    private static int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }

    private static char[] ns() {
        return next().toCharArray();
    }

    private static long[] nal(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nl();
        return a;
    }

    private static int[][] ntable(int n, int m) {
        int[][] table = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[i][j] = ni();
            }
        }
        return table;
    }

    private static int[][] nlist(int n, int m) {
        int[][] table = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[j][i] = ni();
            }
        }
        return table;
    }

    private static int ni() {
        return Integer.parseInt(next());
    }

    private static void tr(Object... o) {
        if (is != System.in)
            System.out.println(java.util.Arrays.deepToString(o));
    }
}