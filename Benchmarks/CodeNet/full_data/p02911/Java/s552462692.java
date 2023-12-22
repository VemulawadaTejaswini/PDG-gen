import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int[] point = new int[n];
        Arrays.fill(point, k);
        for(int i = 0;i < q;i++){
            int tmp = 0;
            tmp = Integer.parseInt(sc.next()); 
            for(int j = 0;j < n;j++){
                if(tmp - 1 != j){
                    point[j] -= 1;
                }
            }
        }
        for(int i = 0;i < n;i++){
            if(point[i] > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}