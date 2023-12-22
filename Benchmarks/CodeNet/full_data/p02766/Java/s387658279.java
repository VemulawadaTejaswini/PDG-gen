import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int i = 0;
        for(;;i++) {
            if(((int)Math.pow(K, i) <= N) && (N < (int)Math.pow(K, i+1))) {
                System.out.println(i+1);
                break;
            }
        }
        sc.close();
    }
}