import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int num = 0;
        
            if(a-1 == n-b) {
                while(a != b) {
                    a++;
                    b--;
                    num++;
                }
                System.out.println(num);
            }
            if(a-1 > n-b) {
                while(a!=b) {
                    a++;
                    while (b < n) {
                        b++;
                    }
                    num++;
                }
                System.out.println(num);
            }
            if(a-1 < n-b) {
                while(a!=b){
                    while(a > 1) {
                        a--;
                    }
                    b--;
                    num++;
                }
                System.out.println(num);
            }
    }
}
