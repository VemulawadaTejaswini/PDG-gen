import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        while (n-- > 0) {
            Integer num = sc.nextInt();
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            } else {
                set.add(num);
            }
            
        }
        if (list.size() < 2) {
            System.out.println("0");
            return;
        }
        list.sort(Comparator.reverseOrder());
        
        int answer = list.get(0) * list.get(1);
        
        System.out.println(answer);
    }
}