import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
 *      /\\\        /\\\      /\\\\\\\\\      /\\\\\\\\\\\   /\\\\\\\\\\\\\     /\\\        /\\\      /\\\\\\\\\      /\\\        /\\\
 *      \/\\\       \/\\\    /\\\\\\\\\\\\\   \/////\\\///   \/\\\/////////\\\  \/\\\       \/\\\    /\\\\\\\\\\\\\   \/\\\       \/\\\
 *       \//\\\      /\\\    /\\\/////////\\\      \/\\\      \/\\\       \/\\\  \/\\\       \/\\\   /\\\/////////\\\  \//\\\      /\\\
 *         \//\\\    /\\\    \/\\\       \/\\\      \/\\\      \/\\\\\\\\\\\\\\   \/\\\\\\\\\\\\\\\  \/\\\       \/\\\   \//\\\    /\\\
 *           \//\\\  /\\\     \/\\\\\\\\\\\\\\\      \/\\\      \/\\\/////////\\\  \/\\\/////////\\\  \/\\\\\\\\\\\\\\\    \//\\\  /\\\
 *             \//\\\/\\\      \/\\\/////////\\\      \/\\\      \/\\\       \/\\\  \/\\\       \/\\\  \/\\\/////////\\\     \//\\\/\\\
 *               \//\\\\\       \/\\\       \/\\\      \/\\\      \/\\\       \/\\\  \/\\\       \/\\\  \/\\\       \/\\\      \//\\\\\
 *                 \//\\\        \/\\\       \/\\\   /\\\\\\\\\\\  \/\\\\\\\\\\\\\/   \/\\\       \/\\\  \/\\\       \/\\\       \//\\\
 *                   \///         \///        \///   \///////////   \/////////////     \///        \///   \///        \///         \///
 */
public class Main implements Runnable {
    public static void main(String[] args) {
        new Thread(null, new Main(),"Main",1<<27).start();
    }
    @Override
    public void run() {
        try{
            FastReader sc = new FastReader();
            int n = sc.nextInt();
            String s = sc.next();
            int count=0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    for(int k = 0; k < n; k++){
                        if(s.charAt(i) != s.charAt(j) && s.charAt(i) != s.charAt(k) && s.charAt(j) != s.charAt(k) && (j-i)!= (k-j) && (j-i) >= 0 && (k-j) >= 0){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
        catch (Exception e){}
    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
