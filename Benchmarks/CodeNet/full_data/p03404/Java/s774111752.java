import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println("100 100");

        int[][] map = new int[100][100];
        for(int i=50; i<100; i++){
            for(int j=0; j<100; j++){
                map[i][j] = 1;
            }
        }

        int cw = 1, cb = 1;

        while(cw < a){
            int ti = cw / 50;
            int tj = cw % 50;
            if(ti % 2 == 0){
                map[ti*2][tj*2] = 1;
            }else{
                map[ti*2][tj*2+1] = 1;
            }
            cw++;
        }

        while(cb < b){
            int ti = cb / 50;
            int tj = cb % 50;
            if(ti % 2 == 0){
                map[99-ti*2][tj*2] = 0;
            }else{
                map[99-ti*2][tj*2+1] = 0;
            }
            cb++;
        }

        for(int i=0; i<100; i++){
            String ans = "";
            for(int j=0; j<100; j++){
                if(map[i][j] == 0){
                    ans += "#";
                }else{
                    ans += ".";
                }
            }
            System.out.println(ans);
        }
    }
}