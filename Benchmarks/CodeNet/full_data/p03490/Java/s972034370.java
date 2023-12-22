import java.util.*;

public class Main {
    static int[] vx = {1,0,-1,0};
    static int[] vy = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();

        boolean[][] dpx = new boolean[s.length() + 1][20000];
        boolean[][] dpy = new boolean[s.length() + 1][20000];
        int off = 10000;
        dpx[0][0 + off] = true;
        dpy[0][0 + off] = true;
        boolean f = true;
        boolean nx = true;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'F') {
                if(f) {
                    for(int j = 0; j < 20000; j++) {
                        dpy[i+1][j] |= dpy[i][j];
                        if(j == 19999) continue;
                        dpx[i+1][j + 1] |= dpx[i][j];
                    }
                } else {
                    if(nx) {
                        for(int j = 0; j < 20000; j++) {
                            dpy[i+1][j] |= dpy[i][j];
                            if(j != 0) {
                                dpx[i+1][j - 1] |= dpx[i][j];
                            }
                            if(j != 19999) {
                                dpx[i+1][j + 1] |= dpx[i][j];
                            }
                        }
                    } else {
                        for(int j = 0; j < 20000; j++) {
                            dpx[i+1][j] |= dpx[i][j];
                            if(j != 0) {
                                dpy[i+1][j - 1] |= dpy[i][j];
                            }
                            if(j != 19999) {
                                dpy[i+1][j + 1] |= dpy[i][j];
                            }
                        }
                    }
                }
                
            } else {
                if(f) {
                    f = false;
                } 
                nx = !nx;
                for(int j = 0; j < 20000; j++) {
                    dpy[i+1][j] = dpy[i][j];
                    dpx[i+1][j] = dpx[i][j];
                }
               
            }
        }


        boolean ans = dpx[s.length()][x + off] && dpy[s.length()][y + off];
        if(ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
