import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    // static int root=0,target=0,n;
    //static int[] tempSub,child,father;
    static HashSet<Integer>[] graph;
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt(), h =sc.nextInt(), w = sc.nextInt();
        int res = h*W+w*H-h*w;
        System.out.println(H*W-res);
    }
}