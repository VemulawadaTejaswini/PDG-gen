import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        char[] text = input.nextLine().trim().toCharArray();
        if(text.length >= 6){
            if(text[3-1]==text[4-1] && text[5-1] ==text[6-1]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }
}
