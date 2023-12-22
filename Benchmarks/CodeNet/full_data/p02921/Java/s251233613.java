import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String[] inputs = input1.split(" ");
        
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        
        if (b == 1) {
            System.out.println(0);
            return;
        }
        
        int count = b / a;
        
        if (a % b > 0) {
            count++;
        } 
        System.out.println(count);
    }
}