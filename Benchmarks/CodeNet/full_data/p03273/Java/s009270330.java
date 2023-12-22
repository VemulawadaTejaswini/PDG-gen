import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int height = Integer.parseInt(input.split(" ")[0]);
        int width = Integer.parseInt(input.split(" ")[1]);

        String grid[][] = new String[height][width];
        for(int i = 0; i < height; i++){
            input = sc.nextLine();
            for(int j = 0; j < width ; j++) {
                grid[i][j] = String.valueOf(input.charAt(j));
            }
        }
        int sumH[] = new int[height];
        for(int i = 0; i < height; i++)sumH[i] = 0;
        int sumW[] = new int[width];
        for(int i = 0; i < width; i++)sumW[i] = 0;
        for(int i = 0; i < height ; i++){
            for(int j = 0; j < width; j++){
                if(grid[i][j] == "."){
                    sumH[i]++;
                    sumW[j]++;
                }
            }
        }
        boolean skipH[] = new boolean[height];
        for(int i = 0; i < height ; i++){
            if(sumH[i] == height)skipH[i] = true;
        }
        boolean skipW[] = new boolean[height];
        for(int i = 0; i < width ; i++){
            if(sumW[i] == width)skipW[i] = true;
        }

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(!skipH[i] && !skipW[j])System.out.print(grid[i][j]);
            }
            if(!skipH[i])System.out.println();
        }
    }

}