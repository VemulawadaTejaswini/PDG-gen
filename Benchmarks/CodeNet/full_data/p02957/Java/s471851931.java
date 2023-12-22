import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B = sc.nextInt();
        if (A<B){
            int tmp = A;
            A=B;
            B=tmp;
        }
        double ans = (A+B)/2.0;
        int floor = (int)ans;
        double finalnum = ans-floor;
        if (finalnum==0){
            System.out.println(floor);
        }else{
            System.out.println("IMPOSSIBLE");
        }
    }
}
