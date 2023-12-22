import java.util.Scanner;

class Solver{

    private final int W;
    private final int H;
    private final int x;
    private final int y;

    Solver(Scanner in){
        W = in.nextInt();
        H = in.nextInt();
        x = in.nextInt();
        y = in.nextInt();
    }

    void solve(){
        System.out.printf("%f %d", 0.5 * W * H, x * 2 == W && y * 2 == H ? 1 : 0);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}