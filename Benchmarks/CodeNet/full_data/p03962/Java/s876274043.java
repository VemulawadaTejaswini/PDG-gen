import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        //重複を許可しない集合構造
        Set<Integer> set = new HashSet<>();
        //a,b,cの格納
        set.add(sc.nextInt());  
        set.add(sc.nextInt());
        set.add(sc.nextInt());

        System.out.println(set.size());
    }
}