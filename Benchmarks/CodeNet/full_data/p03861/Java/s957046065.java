import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = a;i <= b;i++){
            if(i % x == 0){
                list.add(i);
            }
        }
        System.out.println(list.size());
    }
}
