import java.util.Scanner;

public class Main {

    static final int N = (int)1e5;
    static int inp[] = new int[N + N];

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int mn = Integer.MAX_VALUE, pos = -1;
        for(int i = 1; i <= n; i++){
            int x = in.nextInt();
            inp[i] = x;
            inp[i + n] = x;
            if(inp[i] < mn){
                mn = inp[i];
                pos = i;
            }
        }

        boolean ok = true;

        for(int i = pos, j = 1; i <= pos + n - 1; i++, j++){
            int c = inp[pos];
            if(j * c != inp[i]) ok = false;
        }

        if(ok) System.out.println("YES");
        else {
            System.out.println("NO");
        }
    }
}
