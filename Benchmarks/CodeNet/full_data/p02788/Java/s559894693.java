import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N, D, A; {int[] a = in.ii(); N = a[0]; D = a[1]; A = a[2];}
        Monster[] m = new Monster[N];
        for(int i = 0; i < N; i++){
            m[i] = new Monster(in.ii());            
        }
        Arrays.sort(m, (a, b) -> a.x-b.x);
        
        int[] reach = new int[N];
        for(int i = 0; i < N; i++){
            int xi = m[i].x;
            
            int j = i;
            while(j < N){
                if(m[j].x - xi <= 2*D){
                    j++;
                } else {
                    break;
                }
            }
            
            reach[i] = Math.max(0, j-1);
        }
        
        long ans = 0;
        for(int i = 0; i < N; ){
            int n = ((m[i]).hp-1)/A+1;
            ans += n;
            
            int attack = n*A;            
            int nextI = reach[i]+1;
            boolean flag = true;
            for(int j = i+1, M = reach[i]+1; j < M; j++){
                m[j].hp -= attack;
                if(flag && m[j].hp > 0){
                    flag = false;
                    nextI = j;
                }
            }

            i = nextI;
        }
        
        out.println(ans);
    }
    
    static class Monster {
        final int x;
        int hp;
        public Monster(int[] a){
            x = a[0];
            hp = a[1];
        }
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        ArrayList<Integer> li(){
            String[] ss = ss();
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < ss.length; j++) li.add(Integer.parseInt(ss[j]));
            return li;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
