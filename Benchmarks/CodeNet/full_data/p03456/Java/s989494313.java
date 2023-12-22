import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int a_b = a*100 + b;

        boolean heiho_frag=false;

        for(int i=1; i<100; i++) {
            if (a_b == i*i) {
                heiho_frag = true;
                return;
            }
        }

        if(heiho_frag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}