import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] c = new char[h][w];
        for(int i = 0; i < h; i++){
            String s = sc.next();
            for(int j = 0; j < w; j++){
                c[i][j] = s.charAt(j);
            }
        }
        
        int[][] ans = new int[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(i == 0 && j == 0){
                    if(c[i][j] == '#'){
                        ans[i][j] = 1;
                    }else{
                        ans[i][j] = 0;
                    }
                }else if(i == 0){
                    if(c[i][j] == '#'){
                        ans[i][j] = ans[i][j-1] +1;
                    }else{
                        ans[i][j] = ans[i][j-1];
                    }
                }else if(j == 0){
                    if(c[i][j] == '#'){
                        ans[i][j] = ans[i-1][j] +1;
                    }else{
                        ans[i][j] = ans[i-1][j];
                    }
                }else{
                    if(c[i][j] == '#'){
                        ans[i][j] = Math.min(ans[i-1][j], ans[i][j-1]) +1;
                    }else{
                        ans[i][j] = Math.min(ans[i-1][j], ans[i][j-1]);
                    }
                }
            }
        }
        System.out.println(ans[h-1][w-1]);
    }
}