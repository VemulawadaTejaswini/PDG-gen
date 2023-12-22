
import java.util.*;

public class Main {


    static class Pair {
            int x=0;
            int y=0;
            Pair(int x , int y){
                this.x = x;
                this.y = y;
            }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x &&
                    y == pair.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][]  nums = new int[N][2];
        Set<Pair> s = new HashSet<>();
        for (int i = 0; i < N; i++) {
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
            s.add(new Pair(nums[i][0],nums[i][1]));
        }

        HashMap<Pair,Integer> m = new HashMap<>();
        int max = 0;
        Pair maxPair = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i!=j){
                    int p = nums[j][0] - nums[i][0];
                    int q = nums[j][1] - nums[i][1];
                    Pair nw = new Pair(p,q);
                    if(!m.containsKey(nw)){
                        m.put(nw,1);
                    }else{
                        m.put(nw,m.get(nw)+1);
                    }

                    if(m.get(nw) > max ){
                        max =m.get(nw);
                        maxPair = nw;
                    }

                }
            }
        }

        int count =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int p = nums[j][0] - nums[i][0];
                int q = nums[j][1] - nums[i][1];
                if(maxPair.x == p && maxPair.y == q){
                    count++;
                }
            }
        }

        System.out.println(N-count);
    }

}
