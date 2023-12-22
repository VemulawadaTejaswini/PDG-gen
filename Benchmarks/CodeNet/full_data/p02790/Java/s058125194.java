import java.util.*;

public class Main {
    public static void main(String[] args) {

        solve_152_B();

        return;
    }

    private static void solve_152_B() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long number_a = 0;
        long number_b = 0;

        if(a>b){
            for(int i=0; i<a; i++) {
                number_b = number_b*10 + b;
            }
            String number_B = Long.toString(number_b);
            System.out.println(number_B);
        }else{
            for(int i=0; i<b; i++) {
                number_a = number_a*10 + a;
            }
            String number_A = Long.toString(number_a);
            System.out.println(number_A);
        }
    }
}