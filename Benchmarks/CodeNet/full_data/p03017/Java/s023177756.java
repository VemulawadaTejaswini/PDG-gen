import java.util.Scanner;

class Solver {
    private final int N;
    private final int SS;
    private final int FS;
    private final int SG;
    private final int FG;
    private final String S;

    Solver(Scanner in){
        N = in.nextInt();
        SS = in.nextInt();
        FS = in.nextInt();
        SG = in.nextInt();
        FG = in.nextInt();
        S = in.next();
    }

    void solve() {
        String s = S.substring(SS - 1, Math.max(SG, FG) - 1);
        if(s.contains("##")){
            System.out.println("No");
        }else if(SG > FG){
            if(s.indexOf("...", FS - 1) < 0){
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }else System.out.println("Yes");
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}