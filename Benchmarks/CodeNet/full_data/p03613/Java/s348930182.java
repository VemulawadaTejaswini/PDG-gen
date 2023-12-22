import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int a;
        for (int i=0; i<n; i++) {
            a = sc.nextInt();
            list.add(a-1);
            list.add(a);
            list.add(a+1);
        }
        Collections.sort(list);

        int max = 1, count = 1; 
        for (int i=1; i<list.size(); i++) {
            if (list.get(i) == list.get(i-1)) {
                count++;
                if (count > max) { max = count; }
            } else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}