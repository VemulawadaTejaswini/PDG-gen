import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int preT = 0;
        int preX = 0;
        int preY = 0;

        boolean can = true;
        for (int i=0; i<N; i++) {
            int postT = sc.nextInt();
            int postX = sc.nextInt();
            int postY = sc.nextInt();

            int dt = postT - preT;
            int dist = Math.abs(postX - preX) + Math.abs(postY - preY);
            if ((dt < dist) || ((dist - dt) % 2 != 0)) {
                can = false;
                break;
            }

            preT = postT;
            preX = postX;
            preY = postY;
        }

        if (can)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
