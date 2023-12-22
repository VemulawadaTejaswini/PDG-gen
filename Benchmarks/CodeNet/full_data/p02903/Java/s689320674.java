import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        final int H = Integer.valueOf(strings[0]);
        final int W = Integer.valueOf(strings[1]);
        final int A = Integer.valueOf(strings[2]);
        final int B = Integer.valueOf(strings[3]);

        //データ作成
        int[][] map = new int[H][];
        for (int i = 0; i < H; i++) {
            //仮データ挿入
            int[] row = new int[W];
            for (int j = 0; j < A && j < row.length; j++) {
                row[j] = 1;
            }
            map[i] = row;
        }
        //rotate
        for (int i = 0; i < map.length; i++) {
            lotate(map[i],i);
        }
        //check
        System.out.println(checked(map,A,B));

        //print
        for (int i = 0; i < map.length; i++) {
            for (int cell : map[i]) {
                System.out.print(cell);
            }
            if (i != map.length - 1) {
                System.out.println();
            }
        }
    }
    static boolean checked(int[][] map, int A, int B) {
        boolean flag = true;
        //横
        for (int i = 0; i < map.length; i++) {
            int ct = 0;
            for (int cell : map[i]) {
                ct += (cell == 0) ? 1 : 0;
            }
            int min = Math.min(map[i].length - ct, ct);
            if (min != A) {//条件不一致
                flag = false;
                break;
            }
        }
        //縦
        for (int i = 0; i < map[0].length; i++) {
            int ct = 0;
            for (int[] aMap : map) {
                ct += (aMap[i] == 0) ? 1 : 0;
            }
            int min = Math.min(map.length -ct, ct);
            if (min != B) {//条件不一致
                flag = false;
                break;
            }
        }
        return flag;
    }
    static void lotate(int[] row, int num) {
        int[] newArray = new int[row.length];
        for(int x = 0; num >= 1 && x <= row.length-1; x++){
            newArray[(x+num) % row.length ] = row[x];
        }
        for (int i = 0; num >= 1 && i < row.length; i++) {
            row[i] = newArray[i];
        }
    }
}
