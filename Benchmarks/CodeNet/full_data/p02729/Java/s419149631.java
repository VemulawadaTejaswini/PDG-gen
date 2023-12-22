import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        HashMap<Integer,Long> count = new HashMap<>();
        HashMap<Integer,Integer> total = new HashMap<>();
        for(int i=0; i<N; i++){
            int a = scanner.nextInt();
            A.add(a);
            count.putIfAbsent(a, Long.valueOf(0));
            long current = count.get(a);
            count.put(a, current + 1);
        }
        long allpair = 0;
        for(long i:count.values()){
            if(i>0){
                allpair += i*(i-1)/2;
            }
        }
        for(int i=0; i<A.size(); i++){
            int num = A.get(i);
            System.out.println(allpair - (count.get(num)-1));
        }
    }
}