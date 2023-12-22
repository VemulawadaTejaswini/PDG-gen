import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int black = 0;
        char map[][] = new char[h][w];
        char searchmap[][] = new char[h][w];
        for (int y = 0;y < h;++y){
            String s = sc.next();
            for (int x = 0;x < w;++x){
                map[y][x] = s.charAt(x);
                if(map[y][x] == '#')++black;
                searchmap[y][x] = map[y][x];
            }
        }
        searchmap[0][0] = '!';
        System.out.println((w * h - 1 - search(w,h,searchmap)) - black);
    }

    public static int search(int w,int h,char map[][]){
        int count = 0;
        while (true){
            for (int x = 0;x < w;++x){
                for (int y = 0;y < h;++y){
                    if(map[y][x] != '!'&&map[y][x] != '#'){
                        if(x > 0&&map[y][x - 1] == '!'){
                            map[y][x] = '?';
                        }
                        else if(x < w - 1&&map[y][x + 1] == '!'){
                            map[y][x] = '?';
                        }
                        else if(y > 0&&map[y - 1][x] == '!'){
                            map[y][x] = '?';
                        }
                        else if(y < h - 1&&map[y + 1][x] == '!'){
                            map[y][x] = '?';
                        }
                    }
                }
            }
            if(map[h - 1][w - 1] == '?'){
                return count + 1;
            }
            boolean flag = false;
            for (int x = 0;x < w;++x) {
                for (int y = 0; y < h; ++y) {
                    if(map[y][x] == '?'){
                        map[y][x] = '!';
                        flag = true;
                    }
                }
            }
            if(!flag){
                return -1;
            }
            ++count;
        }
    }


}