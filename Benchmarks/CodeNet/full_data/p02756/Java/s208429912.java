import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.LinkedList;

public class Main{
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static int nextInt() {
        try {
            in.nextToken();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return (int) in.nval;
    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        in.nextToken();
        String s = in.sval;
        LinkedList<String> st = new LinkedList<String>();
        st.add(s);
        int n = nextInt();
        boolean a = false;
        for (int i = 0; i < n; i++) {
            int op = nextInt();
            if (op == 1)
                a = !a;
            else {
                int x = nextInt();
                in.nextToken();
                String c = in.sval;
                if ((x == 1 && !a) || (x == 2 && a))
                    st.addFirst(c);
                else
                    st.addLast(c);
            }
        }
        if (!a)
            while (!st.isEmpty())
                System.out.print(st.pollFirst());
        else {
            while (!st.isEmpty())
                System.out.print(st.pollLast());
        }
    }

}
