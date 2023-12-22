import java.util.*;
class Main{
    static char[][] s;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {-1,1,0,0};
    static int h;
    static int w;
    static int thismax;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        h = scanner.nextInt();
        w = scanner.nextInt();
        thismax = 0;
        char[][] c = new char[h][w];
        for(int i = 0; i < h; i++){
            String str = scanner.next();
            for(int j = 0; j < w; j++){
                c[i][j] = str.charAt(j); 
            }
        }


        s = new char[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
               s[i][j] = c[i][j];
            }
        }
        s[0][0] = '0';
        bfs(0,0);

        
        s = new char[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                s[i][j] = c[i][j];
            }
        }
        s[0][w-1] = '0';
        bfs(0,w-1);

        
        s = new char[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                s[i][j] = c[i][j];
            }
        }
        s[h-1][0] = '0';
        bfs(h-1,0);


        
        s = new char[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                s[i][j] = c[i][j];
            }
        }
        s[h-1][w-1] = '0';
        bfs(h-1,w-1);
        System.out.println(thismax);
    }
    public static boolean bfs (int x, int y) {
        Queue <Point> queue = new LinkedList<Point>();
        queue.add(new Point(x,y));
        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            //System.out.println("cur.x : " + cur.x + " cur.y : " + cur.y + " h : " + h + " w : " + w);
            if(!(cur.x >= 0 && cur.y >= 0 && cur.x < h && cur.y < w)){continue;}
            for (int i=0; i<4; i++) {
                Point now = new Point(cur.x+dx[i], cur.y+dy[i]);
                //System.out.println("now.x : " + now.x + " now.y : " + now.y + " h : " + h + " w : " + w);
                if(now.x >= 0 && now.y >= 0 && now.x < h && now.y < w){
                    if(s[now.x][now.y] == '.'){
                        if((char)(s[cur.x][cur.y] + 1) > s[now.x][now.y]){
                            s[now.x][now.y] = (char)(s[cur.x][cur.y] + 1);            
                            thismax = Math.max(thismax, s[now.x][now.y] - '0');
                            //System.out.println(thismax);
                        }
                        //System.out.println("元 : " + s[cur.x][cur.y] + " 次 : " + s[now.x][now.y]);
                        queue.add(now);
                    }
                }
            }
        }
        return false;
    }

    static class Point implements Comparable<Point>{
		int x,y;
		public Point(int x,int y){
			this.x=x;
			this.y=y;
		}
		@Override
		public int compareTo(Point j){
			return this.y-j.y;
		}
	}


}
