import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a   = scan.nextInt();
        int b[] = new int[a];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < a; i++) {
            b[i] = scan.nextInt();
            sum = sum + b[i];
        }

        while(sum % 2 == 0 ){
            count++;
            sum = 0;
            for (int x = 0; x < a; x++) {
                b[x] = b[x]/2 ;
                sum = sum + b[x];
            }
        }

        System.out.println(count);
    }
}