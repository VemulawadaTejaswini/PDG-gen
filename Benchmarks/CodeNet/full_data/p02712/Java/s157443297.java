import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> list = Stream.iterate(1l , (Long i)-> {
            return i + 1l;
        })
                .limit(n).collect(Collectors.toList());
        long sum = 0;
        List<Long> filterd = list.stream().filter(x -> {
            if(x.longValue() % 3 == 0 || x.longValue() % 5 == 0){
                return false;
            }else{
                return true;
            }
        }).collect(Collectors.toList());

        for(Long in : filterd){
            sum += in.longValue();
        }
        System.out.println(sum);
    }
}
