import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int H = Integer.parseInt(s[0]);
        int W = Integer.parseInt(s[1]);
        char [][] cr = new char[H][W];
        for(int i = 0 ; i < H ; i++) {
            String str = stdR.readLine();
            for(int j = 0 ; j < W ; j++) {
                cr[i][j] = str.charAt(j);
            }
        }
        int count = 0;
        while(true) {
            boolean isok = true;
            ArrayList<Integer> x = new ArrayList<Integer>();
            ArrayList<Integer> y = new ArrayList<Integer>();
            for(int i = 0 ; i < H ; i++) {
                for(int j = 0 ; j < W ; j++) {
                    if(cr[i][j] != '#') {
                        isok = false;
                    }else {
                        x.add(j);
                        y.add(i);
                    }
                }
            }
            if(isok)break;
            for(int i = 0 ; i < x.size(); i++) {
                int nx = x.get(i);
                int ny = y.get(i);
                if(nx - 1 >= 0) {
                    cr[ny][nx - 1] = '#';
                }
                if(ny - 1 >= 0) {
                    cr[ny - 1][nx] = '#';
                }
                if(nx + 1 < W) {
                    cr[ny][nx + 1] = '#';
                }
                if(ny + 1 < H) {
                    cr[ny + 1][nx] = '#';
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
