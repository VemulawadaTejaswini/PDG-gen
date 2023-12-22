import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();

        Set<Character> set = new HashSet<Character>();
        for (char ch : S) {
            set.add(ch);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!set.contains(ch)) {
                System.out.println(ch);
                System.exit(0);
            }
        }

        System.out.println("None");

        return;
    }

}