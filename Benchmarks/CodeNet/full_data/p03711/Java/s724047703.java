import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,5,7,8,10,12));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,6,9,11));
      
        String result = "No";
        if ((list1.contains(x) && list1.contains(y)) || (list2.contains(x) && list2.contains(y)) || (x == 2 && y == 2)) result = "Yes";
        System.out.println(result);
    }
}
