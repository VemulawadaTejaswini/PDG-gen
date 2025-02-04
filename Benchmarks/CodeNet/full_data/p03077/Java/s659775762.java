import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        List<Long> list = new ArrayList<Long>();
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
 
        for(int i = 0 ; i < 5; i++) {
            list.add(scan.nextLong());
        }
        long min = Collections.min(list);
        
        long ans = 0;
        if(n % min == 0){
            ans = (n / min) + 4;
        } else {
            ans = (n / min) + 5;
        }
        System.out.println(ans);
    }
}