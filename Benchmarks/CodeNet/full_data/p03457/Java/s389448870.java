import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] t = new int[N];
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++){
            t[i] = input.nextInt();
            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }
        int nx,ny,nt;
        nx = 0;
        ny = 0;
        nt = 0;
        String res = "Yes";
        for (int i = 0; i < N; i++){
            int dx = Math.abs(x[i]-nx);
            int dy = Math.abs(y[i]-ny);
            int dt = Math.abs(t[i]-nt);
            if (dt-(dx+dy) >= 0){
                if ((dt-(dx+dy))%2 == 0){
                    continue;
                } else{
                    res = "No";
                    break;
                }
            } else{
                res = "No";
                break;
            }
        }
        System.out.println(res);
    }
}

