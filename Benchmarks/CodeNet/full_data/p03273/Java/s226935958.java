import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] str = new String[H];
        char[][] c = new char[H][W];
        int[] count = new int[100];
        boolean[] test1 = new boolean[H];
        boolean[] test2 = new boolean[W];
        for(int i=0; i < H; i++){
            str[i] = sc.next();
            //System.out.println(str[i]);
            for(int j=0; j < W; j++){
                c[i][j] = str[i].charAt(j);
                //System.out.print(c[i][j]);
            }
            //System.out.print("\n");
        }
        for(int i=0; i < H; i++){
            for(int j=0; j < W; j++){
                if(c[i][j] == '#'){
                    test1[i] = true;
                    test2[j] = true;
                }
            }
        }
        for(int i=0; i < H; i++){
            for(int j=0; j < W; j++){
                if(test1[i] && test2[j]){
                    System.out.print(c[i][j]);
                }
                if(test1[i] && j==W-1){
                    System.out.println("");
                }
            }
        }
    }
}