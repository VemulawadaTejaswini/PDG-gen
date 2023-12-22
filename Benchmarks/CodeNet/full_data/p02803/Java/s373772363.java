import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        boolean[][] blocks=new boolean[h][w];
        String tmp;
        for(int i=0;i<h;i++){
            tmp=sc.next();
            for(int j=0;j<w;j++){
                blocks[i][j]=tmp.charAt(j)=='.';
            }
        }
        int[][][][] dis=new int[h][w][h][w];//前半二つが表す点から後半二つが表す点への最短経路
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                for(int k=0;k<h;k++){
                    for(int l=0;l<w;l++){
                        dis[i][j][k][l]=-1;
                    }
                }
            }
        }
        int ans=0;
        int[] movex={1,0,-1,0};
        int[] movey={0,1,0,-1};
        Queue<Pair> queue=new ArrayDeque<>();
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                dis[i][j][i][j]=0;
                queue.add(new Pair(i,j));
                while(queue.size()>0){
                    for(int k=0;k<4;k++){
                        try{
                            if(!blocks[queue.peek().x+movex[k]][queue.peek().y+movey[k]]){
                                throw new Exception();
                            }
                            if(dis[i][j][queue.peek().x+movex[k]][queue.peek().y+movey[k]]==-1){
                                dis[i][j][queue.peek().x+movex[k]][queue.peek().y+movey[k]]=dis[i][j][queue.peek().x][queue.peek().y]+1;
                                ans=Math.max(ans, dis[i][j][queue.peek().x][queue.peek().y]+1);
                                queue.add(new Pair(queue.peek().x+movex[k],queue.peek().y+movey[k]));
                            }
                        }catch(Exception e){
                        }
                    }
                    queue.poll();
                }
            }
        }
        System.out.println(ans);
 
    }


}
class Pair{
    int x;
    int y;
    public Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}