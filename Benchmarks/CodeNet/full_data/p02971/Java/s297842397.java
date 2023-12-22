import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) list.add(sc.nextInt());
        for(int i = 0; i < n; i++){
            ArrayList<Integer> list1 = (ArrayList<Integer>)list.clone();
            list1.remove(i);
            Integer a = Collections.max(list1);
            System.out.println(a);
        }
    }
}