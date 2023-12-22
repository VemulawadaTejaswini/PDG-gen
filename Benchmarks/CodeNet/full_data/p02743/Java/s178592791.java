import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         double num1 = Math.sqrt(scan.nextInt()), num2 = Math.sqrt(scan.nextInt()), num3 = Math.sqrt(scan.nextInt());

        if(num1 + num2 < num3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scan.close();
    }
}