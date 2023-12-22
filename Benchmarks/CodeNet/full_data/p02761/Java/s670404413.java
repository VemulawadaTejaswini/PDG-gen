import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] sc = new int[m][2];
        int[] a = new int[n];
        boolean b = true;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < 2; j++){
                sc[i][j] = scan.nextInt();
                for(int k = 0; k < n; k++){
                    if(a[k] == 0){
                        if(sc[i][0] == 1){
                            a[0] = sc[i][1];
                        }else if(sc[i][0] == 2){
                            a[1] = sc[i][1];
                        }else{
                            a[2] = sc[i][1];
                        }
                    }
                }
                if(a[0] != 0 || n == 1){
                    b = true;
                }else{
                    b = false;
                }
            }
        }
        if(b){
            for(int i = 0; i < n; i++){
                System.out.print(Integer.toString(a[i]));
            }
        }else{
            System.out.println("-1");
        }
    }
}