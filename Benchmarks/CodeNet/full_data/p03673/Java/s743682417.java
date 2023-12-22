import java.util.*;

/**
 * Created by DELL on 2017/7/1.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<Integer>list=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            list1.add(list.get(i));
            Collections.reverse(list1);
        }
        list1.forEach(System.out::print);
    }
}
