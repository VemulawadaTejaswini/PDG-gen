import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numA = scanner.nextLine();
        String numB = scanner.nextLine();
        int num = Integer.parseInt(numA + numB);

        for(int i=0; i<1000; i++) {
            if(i*i==num) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
        return;
    }
}