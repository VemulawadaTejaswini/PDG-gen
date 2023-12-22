import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] grid = new char[h][w];
        for(int i = 0; i < h; i++){
            grid[i] = sc.next().toCharArray();
        }
        sc.close();
        boolean res = true;
        for(int j = 0; j < h; j++){
            for(int k = 0; k < w; k++){
                if(grid[j][k] == '.'){
                    continue;
                }else{
                    if(j - 1 >= 0){
                        if(grid[j-1][k] == '#'){
                            continue;
                        }
                    }
                    if(j + 1 < h){
                        if(grid[j+1][k] == '#'){
                            continue;
                        }
                    }
                    if(k - 1 >= 0){
                        if(grid[j][k-1] == '#'){
                            continue;
                        }
                    }
                    if(k + 1 < w){
                        if(grid[j][k+1] == '#'){
                            continue;
                        }
                    }
                    res = false;
                    break;
                }
            }
            if(!res){
                break;
            }
        }
        if(res){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
