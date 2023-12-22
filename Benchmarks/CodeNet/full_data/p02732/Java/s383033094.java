import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i=0; i<N; i++){
            a[i] = scanner.nextInt();
            int c = count.getOrDefault(a[i], 0);
            count.put(a[i], ++c);
        }
        long allpair = 0;
        for(int i:count.keySet()){
            int val = count.get(i);
            if(val>0){
                allpair += (long)val*((long)val-1)/2;
            }
        }
        for(int i=0; i<N; i++){
            int num = a[i];
            if(count.get(num)>1){
                System.out.println(allpair - (count.get(num)-1));
            }else{
                System.out.println(allpair);
            }
        }
    }
}