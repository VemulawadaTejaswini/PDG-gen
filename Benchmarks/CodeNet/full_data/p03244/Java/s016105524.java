import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        Map<Integer,Integer> odd_map = new HashMap<>();
        Map<Integer,Integer> evn_map = new HashMap<>();
        int odd_val; int evn_val;
        for (int i = 0; i < n; i+=2) {
            odd_val = Integer.parseInt(sc.next());
            evn_val = Integer.parseInt(sc.next());
            odd_map.put(odd_val, odd_map.getOrDefault(odd_val, 0)+1);
            evn_map.put(evn_val, evn_map.getOrDefault(evn_val, 0)+1);
        }

        EIITuple mfeOdd = fsFreqElem(odd_map);
        EIITuple mfeEvn = fsFreqElem(evn_map);

        int result;
        if (mfeOdd.fvl == mfeEvn.fvl){

            int res1 = n - mfeOdd.fst - mfeEvn.snd;
            int res2 = n - mfeOdd.snd - mfeEvn.fst;

            result = Math.min (res1, res2);
        } else {
            result = n - mfeOdd.fst - mfeEvn.fst; 
        }

        System.out.print(result + "\n");
    }


    private static EIITuple fsFreqElem(Map<Integer,Integer> map){

        int localMaxValue = -1;
        int localMax1Count = 0;
        int localMax2Count = 0;

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {

            int currentCount = (int) entry.getValue();
            if (currentCount > localMax1Count) {
                localMaxValue  = entry.getKey();

                localMax2Count = localMax1Count;
                localMax1Count = currentCount;
            } else if (currentCount > localMax2Count) {
                localMax2Count = currentCount;
            }

        }

        return new EIITuple (localMaxValue, localMax1Count, localMax2Count);
    }

}

class EIITuple {
    public int fvl;
    public int fst;
    public int snd;
    EIITuple (int v, int f, int s){
        fvl = v; fst = f; snd = s;
    }
}
