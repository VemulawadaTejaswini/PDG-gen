import java.util.*;
import java.lang.*;

class Point{
	int x;
	int y;
	Point(int a,int b){
		this.x = a;
		this.y = b;
	}
}
class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int H = sc.nextInt();
            int W = sc.nextInt();
            
            String[][] S = new String[H][W];

            for(int i = 0 ; i < H ; i++){
                String tmp = sc.next();
                for(int j = 0 ; j < W ; j++){
                    S[i][j] = tmp.substring(j,j+1);
                }
            }
            sc.close();
            int[] dx = {1,0,-1,0};
            int[] dy = {0,1,0,-1};

            int[][] memo = new int[H][W];

            int ans = 0;
            int tmp = 0;
            Queue<Point> queue = new ArrayDeque<Point>();
            for(int i = 0 ; i < H ; i++){
                for(int j = 0 ; j < W ; j++){
                    if(S[i][j].equals("#")){
                        continue;
                    }
                    else{
                        for(int[] x: memo){
                            Arrays.fill(x,0);
                        }
                        tmp = 0;
                                    
                        queue.add(new Point(i,j));

                        while(!queue.isEmpty()){
                            Point p = queue.poll();

                            for(int k = 0 ; k < 4 ; k++){
                                int x = p.x + dx[k];
                                int y = p.y + dy[k];
                                if(x >= 0 && x < H && y >= 0 && y < W && S[x][y].equals(".")){
                                    if(memo[x][y] == 0 && (x==i || y==j)){
                                        memo[x][y]++;
                                        queue.add(new Point(x,y));
                                        tmp++;
                                   }
                                }
                            }
                        }
                        ans = Math.max(ans,tmp);
                    }
                }
            }
                System.out.println(ans);
    }
}

