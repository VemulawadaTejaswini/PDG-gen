import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private int sum(int i, int j, int k, int l, int m, int n) {
        return 100 * i + 101 * j + 102 * k + 103 * l + 104 * m + 105 * n;
    }

    private void check(int X, int i, int j, int k, int l, int m, int n) {
        if (sum(i,j,k,l,m,n) == X) {
            System.out.println(1);
            System.exit(0);
        }
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int N = 1000;
        for (int i = 0; X >= sum(i,0,0,0,0,0); i++) {
            for (int j = 0; X >= sum(i,j,0,0,0,0); j++) {
                for (int k = 0; X >= sum(i,j,k,0,0,0); k++) {
                    for (int l = 0; X >= sum(i,j,k,l,0,0); l++) {
                        for (int m = 0; X >= sum(i,j,k,l,m,0); m++) {
                            for (int n = 0; X >= sum(i,j,k,l,m,n); n++) {
                                check(X,i,j,k,l,m,n);
                            }
                        }
                    }
                }
            }
        }
        
        System.out.println(0);
        return;
    }

}