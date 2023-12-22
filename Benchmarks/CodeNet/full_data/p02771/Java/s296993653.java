import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int[] tri = new int[3];
        for(int i = 0; i < 3; i++)
            tri[i] = scan.nextInt();

        Arrays.sort(tri);
        if((tri[1] == tri[0] && tri[1] != tri[2]) || (tri[1] == tri[2] && tri[1] != tri[0]))
            os.println("Yes");
        else
            os.println("No");
    }
}