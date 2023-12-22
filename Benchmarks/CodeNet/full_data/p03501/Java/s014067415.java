import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int plan1 = A * N;
        int plan2 = B;
        
        if(plan1 > plan2){
            System.out.println(plan2);
        } else {
            System.out.println(plan1);
        }
        
        sc.close();
        
    }
}
