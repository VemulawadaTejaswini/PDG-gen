import java.util.Scanner;

public class Main {
    static boolean ok = true;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int width = scan.nextInt();
        String[][] map = new String[height][width];
        for (int i = 0; i < height; i++){
            map[i] = scan.next().split("");
        }

        deepMap(map,0,0);

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if (map[i][j].equals("#")){
                    ok = false;
                }
            }
        }
        if (ok){
            System.out.println("Possible");
        }else {
            System.out.println("Impossible");
        }
    }

    public static void deepMap(String[][] map, int h, int w){
        map[h][w] = ".";
        try {
            if (map[h][w+1].equals("#")){
                deepMap(map, h, w+1);
            }else if (map[h+1][w].equals("#")){
                deepMap(map, h+1, w);
            }
        }catch (Exception e){
        }
    }
}
