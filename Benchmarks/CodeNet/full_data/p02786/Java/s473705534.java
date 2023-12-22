import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(H);
        
        long count = 0;
        
        while(list.size() != 0){
            Attack(list);
            count++;
        }
        
        System.out.println(count);
    }
    
    public static List Attack(List<Integer> list){
        int a = list.get(0)/2;
        list.remove(0);
        if(a != 0){
            list.add(a);
            list.add(a);
        }
        return list;
    }
}
