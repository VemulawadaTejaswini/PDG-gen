import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();
        long min = 1000000;
        for(int i = 1;i < 1000000;i++){
            long S = N;
            if(S%i == 0){
                 long n = ((S/i) - 1) + (i - 1);
                 if(n < min) min = n;
            }
        }
        System.out.println(min);
    }
}
