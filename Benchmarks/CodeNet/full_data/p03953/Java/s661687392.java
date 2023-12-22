import java.util.*;

class Rabbit {
    private float posE;

    public Rabbit(int posE) {
        this.posE = (float)posE;
    }

    public void set_pos(int x) {
        this.posE = x;
    }

    public float get_pos() {
        return posE;
    }

    public void jump(Rabbit r1, Rabbit r2) {
//        System.out.printf("jump from : %f\n", get_pos());
        posE += (r1.get_pos() - get_pos()) + (r2.get_pos() - get_pos());
//        System.out.printf("jump from : %f\n", get_pos());
    }

    public void printPos() {
        System.out.printf("%.9f\n", get_pos());
    }
}


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Initialize rabbit list
        Rabbit[] rabbits = new Rabbit[n+1];
        for (int i = 1; i <= n; i++) {
            rabbits[i] = new Rabbit(sc.nextInt());
        }

        int m = sc.nextInt();
        int k = sc.nextInt();
        int r;

        int[] jumpList = new int[m];
        for (int i = 0; i < m; i++)
            jumpList[i] = sc.nextInt();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                r = jumpList[j];
                rabbits[r].jump(rabbits[r+1], rabbits[r-1]);
            }
        }

        // Print final answer
        for (int i = 1; i <= n; i++)
            rabbits[i].printPos();

    }
}