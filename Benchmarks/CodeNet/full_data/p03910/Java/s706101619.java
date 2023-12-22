import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int sum = 0;
        ArrayList<Integer> problemList = new ArrayList<>();
        
        for(int i = 0; sum <= n; ++i) {
            sum += i;
            problemList.add(i);
        }
        
        int diff = sum - n;
        problemList.remove(diff);
        
        for(int i = 0; i < problemList.size(); ++i) {
            if(problemList.get(i) > 0) System.out.println(problemList.get(i));
        }
    }
}
