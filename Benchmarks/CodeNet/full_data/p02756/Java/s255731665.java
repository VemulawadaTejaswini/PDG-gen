import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String s = in.next();
        LinkedList<String> st = new LinkedList<String>();
        st.add(s);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = in.nextInt();
        boolean a = false;
        for (int i = 0; i < n; i++) {
            int op = in.nextInt();
            if (op == 1)
                a = !a;
            else {
                int x = in.nextInt();
                String c = in.next();
                if ((x == 1 && !a) || (x == 2 && a))
                    st.addFirst(c);
                else
                    st.addLast(c);
            }
        }
        if (!a)
            while (!st.isEmpty())
                out.print(st.pollFirst());
        else {
            while (!st.isEmpty())
                out.print(st.pollLast());
        }
        out.flush();
    }

}
