import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int w = input.nextInt();
        String[][] map = new String[h][w];
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                map[i][j] = input.next();
            }
        }
        int height = 1;
        char width = 'A';
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                if (map[i][j].equals("snuke")){
                    width = (char)(((int)'A')+j);
                    height += i;
                }
            }
        }
        System.out.printf("%s%d\n",width,height);
    }
}