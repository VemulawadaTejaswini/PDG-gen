import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(scan.nextInt());
        }
        Collections.sort(list);
        
        System.out.println(list.get(list.size()-1)-list.get(0));
    }
}
