import java.util.*;

public class Main {
    static int[][] mp;
    static int H, W;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        mp = new int[H][];
        Set<Integer> visited = new HashSet<>();
        for(int i=0;i<H;i++){
            String s = sc.next();
            mp[i] = new int[W];
            char[] sca = s.toCharArray();
            for(int j=0;j<W;j++)
                mp[i][j] = sca[j] == '#' ? 1 : 0;
        }
        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingInt(obj->obj.fc));
        pq.add(new State(0,0,0, mp[0][0]));
        visited.add(key(0,0));
        int first = mp[0][0];
        while(!pq.isEmpty()){
            State st = pq.poll();
            visited.add(key(st.y, st.x));
            if(st.y==H-1 && st.x==W-1){
                System.out.println(st.fc + first);
                return;
            }
            if(st.y+1 < H){
                int add=0;
                if(st.isBlk==0 && mp[st.y+1][st.x]==1)
                    add=1;
                if(!visited.contains(key(st.y+1, st.x)))
                    pq.add(new State(st.x, st.y + 1, st.fc+add, mp[st.y + 1][st.x]));
            }
            if(st.x+1 < W){
                int add=0;
                if(st.isBlk == 0 && mp[st.y][st.x+1] == 1)
                    add=1;
                if(!visited.contains(key(st.y, st.x+1)))
                    pq.add(new State(st.x+1, st.y, st.fc + add, mp[st.y][st.x+1]));
            }
        }

    }
    private static int key(int h, int w){
        return h*100+w;
    }

    private static class State{
        int x,y;
        int fc;
        int isBlk;
        State(int x, int y, int fc, int isBlk){
            this.x = x;
            this.y = y;
            this.fc = fc;
            this.isBlk = isBlk;
        }
    }
}
