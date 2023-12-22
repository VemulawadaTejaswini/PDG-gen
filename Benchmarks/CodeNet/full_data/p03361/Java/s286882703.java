import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String line = br.readLine();
        String[] lineArray = line.split(" ");
        int H = Integer.parseInt(lineArray[0]);
        int W = Integer.parseInt(lineArray[1]);

        char[][] campus = new char[H + 2][W + 2];

        for (int i = 1; i < H+1; i++) {
            line = br.readLine();
            for (int j = 1; j < W+1; j++) {
                campus[i][j] = line.charAt(j-1);
            }
        }

        String result = "Yes";
        for (int i = 1; i < H+1; i++) {
            for (int j = 1; j < W+1; j++) {
                if( !(campus[i-1][j] == '#' || campus[i][j-1] == '#' || campus[i][j+1] == '#' || campus[i+1][j] == '#' ) && campus[i][j] == '#' ){
                    result = "No";
                    break;
                }
            }
            if(result.equals("No")){
	            break;
            }
        }

        System.out.println(result);

    }
}