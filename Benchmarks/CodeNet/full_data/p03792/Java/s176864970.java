import java.util.*;

class Main{

    class Pair{
        int[][] mass;
        int num;
        Pair(int[][] mass, int num){
            this.mass = mass;
            this.num = num;
        }
    }

    LinkedList<Pair> list;
    HashSet<Integer> hash;
    int n;

    void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] mass = new int[n][n];
        for(int i=0; i<n; i++){
            char[] line = sc.next().toCharArray();
            for(int j=0; j<n; j++){
                if(line[j]=='#') mass[i][j] = 1;
            }
        }

        list = new LinkedList<Pair>();
        hash = new HashSet<Integer>();
        list.add(new Pair(mass, 0));
        hash.add(hash(mass));
        System.out.println(bfs());
    }

    int bfs(){
        while(list.size()>0){
            Pair p = list.poll();
            int[][] mass = p.mass; int num = p.num;

            //print(mass, num);

            if(allBlack(mass)) return num;
            //if(hash.size()>=512) return -1;

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    int[][] nmass = copy(mass, i, j);
                    //System.out.println("-----");
                    //print(nmass, num);
                    if(hash.add(hash(nmass))) list.add(new Pair(nmass, num +1));
                }
            }
        }
        return -1;
    }

    boolean allBlack(int[][] mass){
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++) if(mass[i][j]==0) return false;
        return true;
    }

    int[][] copy(int[][] mass, int from, int to){
        int[][] nmass = new int[n][n];
        for(int i=0; i<n; i++) for(int j=0; j<n; j++) nmass[i][j] = mass[i][j];
        for(int i=0; i<n; i++) nmass[i][to] = mass[from][i];
        return nmass;
    }

    int hash(int[][] mass){
        int pow = 1;
        int res = 0;
        for(int i=0; i<n; i++) for(int j=0; j<n; j++){
            res += mass[i][j] * pow;
            pow *= 10;
        }
        return res;
    }
    
    void print(int[][] mass, int num){
        System.out.println(num+"回目");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}