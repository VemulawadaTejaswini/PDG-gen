import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int[][] a = new int[x + 1][y + 1];
        for(int i = 0 ; i <= x ; i++){
            for(int j = 0 ; j <= y ; j++){
                if(i == 0 && j == 0){
                    a[i][j] = 1;
                }else if(i == 0 || j == 0){
                    a[i][j] = 0;
                }else if(i < 2 && j < 2){
                    a[i][j] = 0;
                }else if(i < 2){
                    a[i][j] = a[i - 1][j - 2];
                }else if(j < 2){
                    a[i][j] = a[i - 2][j - 1];
                }else{
                    a[i][j] = (a[i - 1][j - 2] + a[i - 2][j - 1]) % 1000000007;
                }
            }
        }
        System.out.println(a[x][y] % 1000000007);
    }
}