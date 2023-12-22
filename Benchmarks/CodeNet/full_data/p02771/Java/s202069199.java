import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int count = 0;

        if(num1 != num2){
            count++;
        }

        if(num2 != num3){
            count++;
        }

        if(num1 != num3){
            count++;
        }

        if(count == 1 || count ==2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
