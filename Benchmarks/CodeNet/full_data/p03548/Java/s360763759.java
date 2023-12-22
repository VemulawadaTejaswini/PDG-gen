import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) throws IOException

    {
        Scanner in = new Scanner(System.in);
        P78BSolver s = new P78BSolver(in, System.out);
        s.read();
        s.solve();
    }
}

class P78BSolver
{
    Scanner in;
    PrintStream out;
    int X, Y, Z;

    public P78BSolver(Scanner s, PrintStream p)
    {
        in = s;
        out = p;
    }

    public void read() throws IOException
    {
        X = in.nextInt();
        Y = in.nextInt();
        Z = in.nextInt();
    }

    public void solve()
    {
        X -= Y + 2 * Z;
        System.out.println(1 + (X / (Y + Z)));
    }
}
