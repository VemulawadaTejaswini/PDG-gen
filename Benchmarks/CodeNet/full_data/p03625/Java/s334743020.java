import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        Map<Long, Long> l = new HashMap<>();
        for(int i = 0;i < N;i++){
            long a = sc.nextLong();
            if(l.containsKey(a))    l.put(a, l.get(a)+1);
            else    l.put(a, (long)1);
        }
        long m1 = 0;
        long m2 = 0;
        for(Long key : l.keySet()){
            long value = l.get(key);
            if(key > m1){
                if(value >= 4){
                    m1 = key;
                    m2 = key;
                }else if(value >= 2){
                    m2 = m1;
                    m1 = key;
                }
            }else if(key > m2 && value >= 2){
                m2 = key;
            }
        }
        System.out.println(m1*m2);
    }
}