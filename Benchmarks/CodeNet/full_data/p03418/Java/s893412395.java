
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for (int b = k; b <= n; b++) {
            if(b==0){
                continue;
            }
            for (int a = 1; a <= n; a++) {
                
                if ((a % b) >= k) {
                    sum++;
                }
            }
        }
        
        System.out.println(sum);
    }
}
