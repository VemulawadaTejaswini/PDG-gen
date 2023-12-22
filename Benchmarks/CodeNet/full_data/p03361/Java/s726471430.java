import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] in = new String[W];
        for (int i = 0; i < H; i++) {
            in[i] = sc.next();
        }
        int[] xSerch = {-1,0,0,1};
        int[] ySerch = {0,1,-1,0};
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (in[i].charAt(j) == '#') {
                    boolean ok = false;
                    for (int k = 0; k < 4; k++) {
                        int x = j+xSerch[k];
                        int y = i+ySerch[k];
                        if (-1 < x && x < W && -1 < y && y < H) {
                            if (in[y].charAt(x) == '#') {
                                ok = true;
                            }
                        }
                    }
                    if (!ok) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}