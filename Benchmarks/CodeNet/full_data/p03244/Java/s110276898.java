import java.util.*;

public class Main {

    public static void main(String[] args) {

        // read n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // read list and build map
        Map<Integer,Integer> odd_map = new HashMap<>();
        Map<Integer,Integer> evn_map = new HashMap<>();
        Integer odd_val; Integer evn_val;
        for (int i = 0; i < n; i+=2) {
            odd_val = sc.nextInt();
            evn_val = sc.nextInt();
            odd_map.put(odd_val, odd_map.getOrDefault(odd_val, 0)+1);
            evn_map.put(evn_val, evn_map.getOrDefault(evn_val, 0)+1);
        }

        // count
        EIITuple mfeOdd = fsFreqElem(odd_map);
        EIITuple mfeEvn = fsFreqElem(evn_map);

        int result;
        if (mfeOdd.fvl == mfeEvn.fvl){

            int res1 = n - ((int) mfeOdd.fst) - ((int) mfeEvn.snd);
            int res2 = n - ((int) mfeOdd.snd) - ((int) mfeEvn.fst);

            result = Math.min (res1, res2);
        } else {
            result = n - ((int) mfeOdd.fst) - ((int) mfeEvn.fst); 
        }

        System.out.print(result + "\n");
    }

    private static EIITuple fsFreqElem(Map<Integer,Integer> map){

        Integer localMaxValue = -1;
        Integer localMax1Count = 0;
        Integer localMax2Count = 0;

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {

            int currentCount = (int) entry.getValue();
            if (currentCount >= localMax1Count){
                localMaxValue  = entry.getKey();

                localMax2Count = localMax1Count;
                localMax1Count = currentCount;
            }

        }

        return new EIITuple (localMaxValue, localMax1Count, localMax2Count);
    }

}

class EIITuple {
    public Integer fvl;
    public Integer fst;
    public Integer snd;
    EIITuple (Integer v, Integer f, Integer s){
        fvl = v; fst = f; snd = s;
    }
}