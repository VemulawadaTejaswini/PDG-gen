import java.io.*;
import java.util.*;

class Project {
    int id;
    List<Project> dependecies;

    public Project(int id) {
        this.id = id;
    }
}

class Item {
    int val;
    int index;

    public Item(int val, int index) {
        this.val = val;
        this.index = index;
    }
}

public class Main {

    private  static int count = 0;
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        /*Project a = new Project(1);
        Project b = new Project(2);
        Project c = new Project(3);
        Project d = new Project(4);
        Project e = new Project(5);
        List<Project> dep = new ArrayList<>();
        dep.add(b);
        dep.add(c);
        a.dependecies = dep;
        dep = new ArrayList<>();
        dep.add(d);
        b.dependecies = dep;
        dep = new ArrayList<>();
        dep.add(e);
        d.dependecies = dep;
        List<Project> projects = new ArrayList<>();
        projects.add(a);
        projects.add(b);
        projects.add(c);
        projects.add(d);
        projects.add(e);

        dfs(projects);*/

        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        if(a == 1) sum+=300000;
        if(a == 2) sum+=200000;
        if(a == 3) sum+=100000;
        if(b == 1) sum+=300000;
        if(b == 2) sum+=200000;
        if(b == 3) sum+=100000;

        if(a == 1 && b == 1) sum+=400000;
        out.println(sum);

        out.flush();
    }
    private static int numberOfDigits(long n) {
        return Long.toString(n).length();
    }
    private static void dfs(List<Project> projects) {
        Set<Integer> set = new HashSet<>();

        for (Project pr : projects) {
            if(!set.contains(pr.id)) {
                printOrder(pr,set);
                set.add(pr.id);
            }
        }

    }
    private static void printOrder(Project pr, Set<Integer> set) {
        if(pr.dependecies == null) {
            System.out.print(pr.id + " ");
            return;
        }

        List<Project> dep = pr.dependecies;
        for (Project p : dep) {
            if(!set.contains(p.id)) {
                printOrder(p,set);
                set.add(p.id);
            }
        }

        System.out.print(pr.id + " ");
    }

    private static void permutationOfNumbers(int n, int m, int [] a, int index) {
        if(index == n) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i = 1; i <=m; i++) {
            a[index] = i;
            permutationOfNumbers(n,m,a,index + 1);
        }
    }

    private static void permutationOfLetters( char m, int index, char[] a) {
        if(index == a.length) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for (char c = 'a'; c <=m; c++) {
            a[index] = c;
            permutationOfLetters(m,index + 1, a);
        }
    }

    private static void permutations(int n, int index, int [] a, boolean [] used) {
        if(index == n) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i = 1; i <=n; i++) {
            if(used[i]) continue;
            a[index] = i;
            used[i] = true;
            permutations(n,index + 1,a,used);
            used[i] = false;
        }
    }

    private static void generateCorrectBracket(String s, int openOne, int closeOne, int openTwo, int closeTwo, int n) {
        if(s.length() == 2 * n) {
            if(openOne + closeOne == 2*n || openTwo + closeTwo == 2*n || openOne + openTwo == closeOne + closeTwo) {
                if(correct(s)) {
                    count++;
                    if(count == 8233)
                    System.out.println(s + " " + count);
                }
            }
            return;
        }
        if(openOne < n) {
            generateCorrectBracket(s + "(", openOne + 1, closeOne, openTwo, closeTwo, n);
        }
        if(closeOne < openOne) {
            generateCorrectBracket(s + ")", openOne, closeOne + 1, openTwo, closeTwo, n);
        }
        if(openTwo < n) {
            generateCorrectBracket(s + "[", openOne, closeOne, openTwo + 1, closeTwo, n);
        }
        if(closeTwo < openTwo) {
            generateCorrectBracket(s + "]", openOne, closeOne, openTwo, closeTwo + 1, n);
        }
    }
    private static boolean correct(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[') {
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) return false;
                char peek = stack.peek();
                if(peek == '(' && c == ']') return false;
                if(peek == '[' && c == ')') return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    private static void divideNumber(int sum, int last, int n, List<Integer> current) {
        if(sum > n) {
            return;
        }
        if(sum == n) {
            System.out.println(current);
            return;
        }
        for (int i = last; i <= n - sum ; i++) {
            current.add(i);
            divideNumber( sum + i, i,n,current);
            current.remove(current.size() - 1);
        }
    }
    private static void fishki(String s, int n, int m) {
        if(s.length() == n) {
            if(m == 0) {
                System.out.println(s);
            }
            return;
        }

        fishki(s + "*", n, m - 1);
        fishki(s + ".", n, m);
    }
    private static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(i > 0 && s.charAt(i) == '*' && s.charAt(i-1) == '*') return false;
        }
        return true;
    }
    private static boolean [] erath() {
        boolean[] isPrime = new boolean[200_000 + 1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        int n = isPrime.length - 1;
        for (int i = 2; i*i<=n; i++) {
            if(isPrime[i]) {
                for (int j = i*i; j <=n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }



    public static long gcd(long a, long b) {
       while (b > 0) {
           long temp = a;
           a = b;
           b = temp%b;
       }
       return a;
    }


    private static int factorization(long n) {
        Set<Long> set = new HashSet<>();
        for(long i = 2; i * i <=n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        if(n > 1) set.add(n);
        return set.size();
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

    public Integer nextInt(){
        return Integer.valueOf(next());
    }
    public Long nextLong() {
        return  Long.valueOf(next());
    }
    public Double nextDouble() {
        return Double.valueOf(next());
    }
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