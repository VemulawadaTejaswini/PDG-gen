import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                int h = sc.nextInt();
                int w = sc.nextInt();
                int[][] a = new int[h][w];
                for(int i = 0 ; i < h ; i++){
                        for(int j = 0 ; j < w ; j++){
                                a[i][j] = sc.nextInt();
                        }
                }
                sc.close();
                int[][] q = new int[4][w * h];
                int yono = 0;
                for(int i = 0 ; i < w ; i++){
                        for(int j = 0 ; j < h - 1 ; j++){
                                if(a[j][i] % 2 != 0){
                                        q[0][yono] = j;
                                        q[1][yono] = i;
                                        q[2][yono] = j + 1;
                                        q[3][yono] = i;
                                        yono++;
                                        a[j + 1][i]++;
                                }
                        }
                }
                for(int i = 0 ; i < w - 1 ; i++){
                        if(a[h - 1][i] % 2 != 0){
                                q[0][yono] = h - 1;
                                q[1][yono] = i;
                                q[2][yono] = h - 1;
                                q[3][yono] = i + 1;
                                yono++;
                                a[h - 1][i + 1]++;
                        }
                }
                System.out.println(yono);
                for(int i = 0 ; i < yono ; i++){
                        for(int j = 0 ; j < 4 ; j++){
                                System.out.print(q[j][i] + 1);
                                if(j == 3) System.out.println();
                                else System.out.print(" ");
                        }
                }
        }
}