import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long c = (long) (10E9 + 1);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(solve(x,y)%c);
    }
    private static long solve(int x, int y) {
        long[][] tab =  new long[x+1][y+1];
        tab[0][0] = 1;
        for(int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                tab[i][j]  = ((j >= 2) ? tab[i-1][j-2]: 0) + ((i >=2) ? tab[i-2][j-1]: 0);
            }
        }
        return tab[x][y];
    }

}