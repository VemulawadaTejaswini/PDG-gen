import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] O = sc.next().toCharArray();
        char[] E = sc.next().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < E.length; i++) {
            sb.append(O[i]);
            sb.append(E[i]);
        }

        if (O.length - E.length > 0) sb.append(O[O.length - 1]);
        
        
        System.out.println(sb.toString());

        return;
    }

}