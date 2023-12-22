import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ansA = 0;
        int ansB = 0;
        String ans = "DENIED";
        int a[] = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
            if(a[i] % 2 == 0){
                ansA ++;
                if((a[i] % 3 == 0) || (a[i] % 5 == 0)){
                    ansB ++;
                }
            }
        }
        if(ansA == ansB){
            ans = "APPROVED";
        }
        
        System.out.println(ans);
    }
}