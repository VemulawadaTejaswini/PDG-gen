import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();


        double multi = (double)(a * b);
        double right = (double)(c - a - b);

        if( right > 0 && multi < ((right * right) / 4)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scan.close();
    }
}