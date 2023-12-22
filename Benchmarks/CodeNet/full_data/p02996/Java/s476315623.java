import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        SimekiriCost[] simekiriCost = new SimekiriCost[N];
        for(int i=0;i<N;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            simekiriCost[i] = new SimekiriCost(b, a);
        }
        sc.close();
        
        System.out.println(isYes(simekiriCost)? "Yes":"No");
    }
    
    private static boolean isYes(SimekiriCost[] target) {
        Arrays.sort(target, (x, y) -> x.simekiri - y.simekiri);
        int sumCost=0;
        for(int i=0;i<target.length;i++) {
            sumCost += target[i].cost;
            if(sumCost > target[i].simekiri) {
                return false;
            }
        }
        return true;
    }

}

class SimekiriCost{
    int simekiri;
    int cost;
    public SimekiriCost(int simekiri, int cost) {
        super();
        this.simekiri = simekiri;
        this.cost = cost;
    }
    
    
}
