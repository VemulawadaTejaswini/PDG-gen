import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    String[][] inputArray;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int sy = 0;
        int sx = 0;
        int gy = H-1;
        int gx = W-1;
        inputArray = new String[H][W];
        boolean[][] reachedArray = new boolean[H][W];
        int[][] countArray = new int[H][W];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int count = 0;

        for(int i=0; i<H; i++){
            char[] line = sc.next().toCharArray();
            for(int j=0; j<W; j++){
                String s = String.valueOf(line[j]);
                inputArray[i][j] = s;
                if(s.equals(".")){
                    count++;
                }
            }
        }

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(sx, sy));
        reachedArray[sy][sx] = true;

        loop: while(!queue.isEmpty()){
            Point p = queue.poll();
            for(int i=0; i<4; i++){
                int tx = p.x + dx[i];
                int ty = p.y + dy[i];

                if(tx < 0 || tx > W-1 || ty < 0 || ty > H-1 || reachedArray[ty][tx] || inputArray[ty][tx].equals("#")){
                    continue;
                }

                if(inputArray[ty][tx].equals(".")){
                    reachedArray[ty][tx] = true;
                    countArray[ty][tx] = countArray[p.y][p.x] + 1;
                    queue.add(new Point(tx, ty));

                    if(ty == gy && tx == gx){
                        break loop;
                    }
                }
            }
        }

        System.out.println((count-2) - (countArray[gy][gx]-1));
    }

    public static void printListOneLine(List list){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static void printList(List list){
        for(int i=0; i<list.size(); i++){
            if(i == list.size()){
                System.out.println(list.get(i));
            } else {
                System.out.print(String.format("%d ", list.get(i)));
            }
        }
    }

    public static void printDoubleArray(String[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(j == array[0].length-1){
                    System.out.println(array[i][j]);
                } else {
                    System.out.print(array[i][j]);
                }
            }
        }
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            if(i == array.length){
                System.out.println(array[i]);
            } else {
                System.out.print(String.format("%d ", array[i]));
            }
        }
    }

    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}

class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
