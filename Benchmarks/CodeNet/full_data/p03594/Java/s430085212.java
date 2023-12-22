import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by torum on 2017/09/23.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H= sc.nextInt();
        int W= sc.nextInt();
        int d= sc.nextInt();
        int[][] colors = new int[H][W];

        for(int i = 0;i < H;i++){
            for(int j = 0;j < W;j++){
                colors[i][j] = 0;
            }
        }
        colors[0][0] = 0;
        for(int i = 0;i < H;i++){
            for(int j = 0;j < W;j++){
                int nowcolor = colors[i][j];
                for(int s = 0;s< d;s++){
                    if(i+s < H && j+(d-s) < W){
                        if(colors[i+s][j+(d-s)]%4 == nowcolor%4){
                            colors[i+s][j+(d-s)] = nowcolor+1;
                        }
                    }
                    if(i-s >= 0 && j+(d-s) < W){
                        if( colors[i-s][j+(d-s)]%4 == nowcolor%4){

                            colors[i-s][j+(d-s)] = nowcolor+1;
                        }
                    }
                    if(i+s < H && j-(d-s) >= 0){
                        if(colors[i+s][j-(d-s)]%4 == nowcolor%4){

                            colors[i+s][j-(d-s)] = nowcolor+1;
                        }
                    }
                    if(i-s >= 0 && j-(d-s) >= 0){
                        if( colors[i-s][j-(d-s)]%4 == nowcolor%4){
                            colors[i-s][j-(d-s)] = nowcolor+1;
                        }
                    }
                }
            }
        }
        for(int i = 0;i < H;i++){
            for(int j = 0;j < W;j++){
             switch(colors[i][j]%4){
                 case 0:
                     System.out.print("R");
                     break;
                 case 1:
                     System.out.print("Y");
                     break;
                 case 2:
                     System.out.print("G");
                     break;
                 case 3:
                     System.out.print("B");
                     break;
             }
            }
            System.out.println();
        }


    }
}
