import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] cells = line.split(" ");
        int h = Integer.parseInt(cells[0]);
        int w = Integer.parseInt(cells[1]);
        char[][] grid = new char[h][w];
        for(int i=0;i<h;i++){
            grid[i] = sc.nextLine().toCharArray();
        }
        boolean can = true;
        for(int i=0;i<h;i++){
            if(can){
                for(int j=0;j<w;j++){
                    if(grid[i][j]=='.'){continue;}
                    if(searchBomb(grid, i, j)){
                        continue;
                    }else{
                        can = false;
                        break;
                    }
                }
            }else{
                break;
            }
        }
        if(can){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean searchBomb(char[][] grid, int i, int j){
        final int[] dx = new int[]{1, 0, -1, 0};
        final int[] dy = new int[]{0, 1, 0, -1};
        boolean exist = false;
        for(int idx = 0;idx<4;idx++){
            int ni=i+dx[idx], nj=j+dy[idx];
            if(ni<0||grid.length<=ni){continue;}
            if(nj<0||grid[i].length<=nj){continue;}
            if(grid[ni][nj]=='#'){exist=true; break;}
        }
        return exist;
    }
}