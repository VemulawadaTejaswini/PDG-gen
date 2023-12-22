import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        String s = sc.next();
        char[] odd = {'R', 'U', 'D'};
        char[] even = {'L', 'U', 'D'};

        for (int i = 0; i < s.length(); i++) {
            if ((i+1) % 2 == 1) {
                switch (s.charAt(i)) {
                    case 'R':
                    case 'U':
                    case 'D':
                        break;
                    default:
                        System.out.println("No");
                        return;
                }
            } else {
                switch (s.charAt(i)) {
                    case 'L':
                    case 'U':
                    case 'D':
                        break;
                    default:
                        System.out.println("No");
                        return;
                }
            }
        }
        System.out.println("Yes");
    }
}

