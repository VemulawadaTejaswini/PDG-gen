import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
    public static void main(String args[]){

        String input[] = new String[2];

        try{
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine().split(" ");
        } catch(InputMismatchException e){
            System.out.println(e);
        }

        int buttons[] = new int[2];
        for(int i = 0; i < input.length; i++){
            buttons[i] = Integer.parseInt(input[i]);
        }

        if(Math.abs(buttons[0] - buttons[1]) <= 1){
            System.out.println(buttons[0] + buttons[1]);
        }
        else{
            if(buttons[0] > buttons[1]){
                System.out.println(buttons[0] * 2 - 1);
            }
            else{
                System.out.println(buttons[1] * 2 - 1);
            }
        }
    }
}
