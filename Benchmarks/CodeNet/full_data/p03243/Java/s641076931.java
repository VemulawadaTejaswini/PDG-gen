import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int a = 111;
        for (int i=2; i<=10; i++){
            if (a >= n){
                System.out.println(a);
                return;
            }else{
                a = 111 * i;
            }
        }

    }
}