import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static List<List<Long>> cnts = new ArrayList<>();
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        List<Long> k1 = Arrays.asList(1L,2L,3L,4L,5L,6L,7L,8L,9L);
        cnts.add(k1);
        gen(10);
        System.out.println(cnts.stream().flatMap(p->p.stream()).limit(K).collect(Collectors.toList()).get(K-1));
    }

    private static void gen(int keta){
        if(cnts.size() < keta){
            gen(keta-1);
        }
        List<Long> ket = cnts.get(keta-1).stream().flatMap(p -> {
            List<Long> ret = new ArrayList<>();
            long last = p % 10;
            if(last > 0){
                ret.add(p*10+last-1);
            }
            ret.add(p*10+last);
            if(last < 9){
                ret.add(p*10+last+1);
            }
            return ret.stream();
        }).collect(Collectors.toList());
        cnts.add(ket);
    }
}
