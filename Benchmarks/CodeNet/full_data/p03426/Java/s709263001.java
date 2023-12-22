import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String HWD = br.readLine();
        int H = Integer.parseInt(HWD.split(" ")[0]);
        int W = Integer.parseInt(HWD.split(" ")[1]);
        int D = Integer.parseInt(HWD.split(" ")[2]);
     
        coord[] location = new coord[H*W+1];
        location[0] = new coord(-1,-1);
        
        for(int i = 0; i < H; i++){
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < W; j++){
                int temp = Integer.parseInt(line[j]);
                location[temp] = new coord(i,j);
            }
        }
        
        int Q = Integer.parseInt(br.readLine());
        while(Q-- > 0){
            String str = br.readLine();

            System.out.println(cost(location,Integer.parseInt(str.split(" ")[0]),Integer.parseInt(str.split(" ")[1]),D));
        }
    }
    
    static class coord{
        int x;
        int y;

        public coord(int xx, int yy){
            x = xx;
            y = yy;
        }
    }
    
    static int cost(coord[] location, int cur, int end, int add){
        int ans = 0;
        while(cur < end){
            ans += Math.abs(location[cur].x - location[cur+add].x) + Math.abs(location[cur].y - location[cur+add].y);
            cur += add;
        }
        
        return ans;
    }
}
