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
        int X = numList.stream().reduce(0,(s1,s2) -> s1 + s2);
        double x1 = Math.ceil(((double)X / numList.size()));
        double x2 = Math.floor(((double)X / numList.size()));
        int res1 = 0;
        int res2 = 0;
        for(int i = 0; i < numList.size();i++){
            res1 += Math.pow(numList.get(i) - x1 , 2);
            res2 += Math.pow(numList.get(i) - x2 , 2);
        }
        System.out.println(Math.min(res1,res2));
    }
}
