import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        
        int[][] pos = new int[h*w+1][2];
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                int idx = sc.nextInt();
                pos[idx] = new int[]{j, i};
            }
        }
        
        int[][] rsk = new int[d][h*w/d+1];
        for(int i=d+1; i<=h*w; i++){
            int dif = Math.abs(pos[i][0] - pos[i-d][0]) + Math.abs(pos[i][1] - pos[i-d][1]);
            rsk[i%d][i/d] = rsk[i%d][i/d-1] + dif;
        }
        
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int di = l%d;
            int dl = l/d;
            int dr = r/d;
            System.out.println(rsk[di][dr] - rsk[di][dl]);
        }
    }
}
