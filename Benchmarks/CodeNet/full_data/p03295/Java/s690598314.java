import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[m];
        ArrayList<F> fs = new ArrayList<>();
        ArrayList<F>[] connects = new ArrayList[m];
        for (int i = 0;i < n - 1;++i){
            fs.add(new F());
        }
        for (int i = 0;i < m;++i){
            connects[i] = new ArrayList<>();
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 2;
            for (int j = a[i];j <= b[i];++j){
                fs.get(j).connects.put(i,true);
                connects[i].add(fs.get(j));
            }
        }
        for (int i = 0;i < n - 1;++i){
            fs.get(i).sync();
        }
        int co = 0;
        F f = Collections.max(fs, Comparator.comparingInt(c -> c.size));
        while (f.size > 0){
            for (int j:f.connects.keySet()){
                if(!f.connects.get(j))continue;
                for (F fk:connects[j]){
                    if(fk.size > 0&&fk.connects.containsKey(j)&&fk.connects.get(j)){
                        fk.connects.put(j,false);
                        --fk.size;
                    }
                }
                f.connects.put(j,false);
            }
            ++co;
            f.size = 0;
            f = Collections.max(fs, Comparator.comparingInt(c -> c.size));
        }

        System.out.println(co);
    }



    static class F{
        HashMap<Integer,Boolean> connects = new HashMap<>();
        int size = 0;
        void sync(){
            size = connects.size();
        }
    }
}
