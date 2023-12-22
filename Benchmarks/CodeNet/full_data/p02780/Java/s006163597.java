import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BigDecimal d = new BigDecimal("0");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            int itmp = list.get(i).intValue();
            BigDecimal tmp = new BigDecimal(itmp);
            BigDecimal ktmp = new BigDecimal(factorial(itmp));
            d =  d.add(ktmp.divide(tmp));
        }
        System.out.println(d);
}

    static int factorial(int n){
        int fact=0;
        if(n==0)
            return fact;
        else{
            for(int i=n; i>0; i--)
                fact+=i;
            return fact;
        }
    }
}
