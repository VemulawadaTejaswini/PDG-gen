import java.util.*;
import java.io.*;
class Main {
    
    static boolean[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int sx=Integer.parseInt(st.nextToken())+1000;
        int sy=Integer.parseInt(st.nextToken())+1000;
        int tx=Integer.parseInt(st.nextToken())+1000;
        int ty=Integer.parseInt(st.nextToken())+1000;
        map=new boolean[2001][2001];
        String str=bfs(sx,sy,tx,ty);
        str+=bfs(tx,ty,sx,sy);
        str+=bfs(sx,sy,tx,ty);
        System.out.println(str+bfs(tx,ty,sx,sy));
    }
    
    static String bfs(int x,int y,int tx,int ty){
        Queue<zako> queue=new ArrayDeque<>();
        queue.offer(new zako(x,y,"",new ArrayList<>()));
        while(!queue.isEmpty()){
            zako z=queue.poll();
            if(z.x==tx && z.y==ty){
                for(int i=1;i<z.hist.size();i++){
                    //System.out.println((z.hist.get(i)[0]-1000)+" "+(z.hist.get(i)[1]-1000));
                    map[z.hist.get(i)[0]][z.hist.get(i)[1]]=true;
                }return z.op;
            }z.hist.add(new int[]{z.x,z.y});
            if(z.y<2000 && !map[z.x][z.y+1]) queue.offer(new zako(z.x,z.y+1,z.op+"U",z.hist));
            if(z.x<2000 && !map[z.x+1][z.y]) queue.offer(new zako(z.x+1,z.y,z.op+"R",z.hist));
            if(z.y>0 && !map[z.x][z.y-1]) queue.offer(new zako(z.x,z.y-1,z.op+"D",z.hist));
            if(z.x>0 && !map[z.x-1][z.y]) queue.offer(new zako(z.x-1,z.y,z.op+"L",z.hist));
        }
        return "";
    }
    
}

class zako{
    int x,y;
    String op;
    List<int[]> hist=new ArrayList<>();
    zako(int x,int y,String op,List<int[]> hist){
        this.x=x;
        this.y=y;
        this.op=op;
        this.hist=new ArrayList<>(hist);
    }
}