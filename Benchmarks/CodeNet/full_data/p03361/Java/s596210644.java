import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] hw = br.readLine().split(" ");
        int h = Integer.parseInt(hw[0]);
        int w = Integer.parseInt(hw[1]);
        char[][] grid = new char[h+2][w+2];
        
        for (int i = 1; i <= h; i++) {
            String line = br.readLine();
            for (int j = 1; j <= w; j++) {
                grid[i][j] = line.charAt(j-1);
            }
        }
        
        boolean possible = true;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (grid[i][j] == '#') {
                    if (grid[i-1][j] == '.' && grid[i][j+1] == '.' && grid[i+1][j] == '.' && grid[i][j-1] == '.') possible = false;
                }
                else continue;
            }
        }
        
        if (possible) System.out.println("Yes");
        else System.out.println("No");
    }
}
