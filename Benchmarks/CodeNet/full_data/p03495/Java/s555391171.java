// not solved by myself
import java.util.*;
import java.util.Map.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int As[] = new int[N];

        for(int i = 0;i < N;i++){
            As[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> maps = new HashMap<>();
        for(int a : As) {
            if (maps.keySet().contains(a)) {
                int nums = maps.get(a);
                maps.put(a, nums + 1);
            } else {
                maps.put(a, 1);
            }
        }

        List<Entry<Integer,Integer>> entries = new ArrayList<Entry<Integer,Integer>>(maps.entrySet());

        Collections.sort(entries, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });

        int sum = 0;
        for(int i = K;i < entries.size();i++)
            sum += entries.get(i).getValue();


        System.out.println(sum);

    }

     public static long max(int[] ar,int size){
        long max = 0;
        for(int i = 0; i< size;i++)
            if(max < ar[i])
                max = ar[i];
        return max;
    }


    public static long max(List<Long> ar){
        long max = 0;
        for(int i = 0; i< ar.size();i++)
            if(max < ar.get(i))
                max = ar.get(i);
        return max;
    }

    public static Integer min(List<Integer> ar){
        int min = 10000;
        int index = 0;
        for(int i = 0; i< ar.size();i++){
            if(min > ar.get(i)){
                min = ar.get(i);
                index = i;
            }
        }
        return min;
    }


    public static long gcd(long m, long n) {
        if(m == 0)
            return n;
        if(n == 0)
            return m;
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

}



