import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.next();
        List<Integer> numList = new ArrayList<>();
        while(sc.hasNext()){
            numList.add(Integer.parseInt(sc.next()));
        }
        List<Integer> evenList = numList.stream().filter(s -> s%2 ==0).collect(Collectors.toList());
        long cnt = evenList.stream().filter(s-> s%3 ==0 || s%5 ==0).count();
        String str = "DENIED";
        if(evenList.size() == cnt)str = "APPROVED";
        System.out.println(str);
    }
}
