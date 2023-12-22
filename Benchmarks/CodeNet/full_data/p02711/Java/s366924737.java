import java.io.*;
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
            String s = sc.next();
            if(s.contains("7")){
                System.out.println("Yes");
            }
            else{System.out.println("No");}

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
