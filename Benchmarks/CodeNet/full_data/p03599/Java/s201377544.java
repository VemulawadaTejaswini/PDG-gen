import java.util.*;

class Main {
    void solve() {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt() * 100, B = in.nextInt() * 100, C = in.nextInt(), 
            D = in.nextInt(), E = in.nextInt(), F = in.nextInt();
        
        int w = A, s = 0;
        for(int i = 0; i <= F / A; i++){
            for(int j = 0; j <= F / B; j++){
                for(int x = 0; x <= F / C; x++){
                    for(int y = 0; y <= F / D; y++){
                        int a = A * i + B * j;
                        int b = C * x + D * y;
                        if(100 * b <= a * E && b * w > a * s && a + b <= F){
                            w = a;
                            s = b;
                        }
                    }
                }
            }
        }
        System.out.println(w + s + " " + s);
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}