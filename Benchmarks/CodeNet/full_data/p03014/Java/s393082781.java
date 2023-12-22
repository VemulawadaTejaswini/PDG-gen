import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] b = new boolean[h][w];
        
        for(int i=0; i<h; i++){
            String line = sc.next();
            for(int j=0; j<w; j++){
                if(line.charAt(j) == '.'){
                    b[i][j] = true;
                }
            }
        }
        
        UnionFind[] huf = new UnionFind[2002];
        UnionFind[] vuf = new UnionFind[2002];
        
        for(int i=0; i<2002; i++){
            huf[i] = new UnionFind(2002);
            vuf[i] = new UnionFind(2002);
        }
        
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(b[i][j]){
                    //hrz
                    if(i<h-1 && b[i+1][j]){
                        huf[j].unite(i,i+1);
                    }
                    //vrt
                    if(j<w-1 && b[i][j+1]){
                        vuf[i].unite(j,j+1);
                    }
                }
            }
        }
        
        long ans = 0;
        
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(b[i][j]){
                    int c = huf[j].size(i);
                    int d = vuf[i].size(j);
                    
                    //System.out.println("h :" + c + " , v : " + d);
                    ans = Math.max(ans, c+d-1);
                }
            }
        }
        
        System.out.println(ans);
        
    }
    
}


class UnionFind{
    int[] par;
    int[] size;
    
    public UnionFind(int n){
        par = new int[n];
        for(int i=0; i<n; i++){
            par[i] = i;
        }
        size = new int[n];
        Arrays.fill(size, 1);
    }
    
    public int find(int x){
        if(par[x] == x){
            return x;
        }else{
            par[x] = find(par[x]);
            return par[x];
        }
    }
    
    public boolean unite(int x, int y){
        x = find(x);
        y = find(y);
        if(x==y) return false;
        
        if(size[x]<size[y]){
            int tmp = x;
            x = y;
            y = tmp;
        }
        size[x] += size[y];
        par[y] = x;
        return true;
    }
    
    public boolean same(int x, int y){
        return find(x)==find(y);
    }
    
    public int size(int x){
        return size[find(x)];
    }
}
