import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        byte count = 0;

        if(input.charAt(0) == '1'){
            count++;
        }
        if(input.charAt(1) == '1'){
            count++;
        }
        if(input.charAt(2) == '1'){
            count++;
        }

        System.out.println(count);

    }
}