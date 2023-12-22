import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 *
 * @author Node2
 */
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();

        String[] s = str.split(" ");
        int h=Integer.parseInt(s[0]);
        int w=Integer.parseInt(s[1]);
        int n=Integer.parseInt(s[2]);
        
        int[][] sq = new int[h][w];
        for(int i=0;i<h;i++){
            Arrays.fill(sq[i], 0);
        }
        
        for(int i=0;i<n;i++){
        str = in.readLine();
            String[] q = str.split(" ");
            sq[Integer.parseInt(q[0])-1][Integer.parseInt(q[1])-1] = 1;
        }
        
        int[][] an = new int[h][w-2];

        for(int j=0;j<h;j++){
        for(int i=0;i<w-2;i++){
            an[j][i] = sq[j][i] + sq[j][i+1] + sq[j][i+2];
        }
        }
        
        int[] anser = new int[10];
        for(int i=0;i<w-2;i++){
        for(int j=0;j<h-2;j++){
            int k = an[j][i] + an[j+1][i] + an[j+2][i];
            anser[k]++;
        }
        }
        
        for(int i=0;i<10;i++){
            System.out.println(anser[i]);
        }
    }


    
}
