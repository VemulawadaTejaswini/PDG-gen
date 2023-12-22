import java.util.Scanner;

class Solver{

    private final int L;
    private final int R;

    Solver(Scanner in){
        L = in.nextInt();
        R = in.nextInt();
    }

    void solve(){
        if(R - L >= 2019){
            System.out.println(0);
            return;
        }
        int l = L % 2019;
        int r = R % 2019;
        int min = 2019;
        for(int i = l; i <= r; i++){
            for(int j = i + 1; j <= r; j++){
                min = Math.min(min, i * j % 2019);
            }
        }
        System.out.println(min);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}