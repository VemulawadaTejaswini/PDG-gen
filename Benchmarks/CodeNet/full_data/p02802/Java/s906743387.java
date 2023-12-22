import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int penalty = 0;
        int i = 0;
        boolean flag = false;
        List<Integer> list = new ArrayList<>();
        while(i<m){
            int curr = s.nextInt();
            if(!list.contains(curr)){
                list.add(curr);
                flag = false;
            }
            String status = s.next();
            if (list.get(list.size() - 1) == curr && !status.equals("AC") && !flag) {
                penalty++;
            }else{
                flag = true;
            }
            i++;
        }
        System.out.println(list.size()+" "+penalty);
    }
}