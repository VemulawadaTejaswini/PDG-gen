import java.util.Scanner;

class Solver {

    private final String S;

    Solver(Scanner in){
        S = in.next();
    }

    void solve() {
        String[] strings = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            if (s.equals(S)) {
                System.out.println(7 - i);
                return;
            }
        }
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}