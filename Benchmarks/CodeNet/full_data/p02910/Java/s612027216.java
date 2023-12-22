import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String dance = scan.nextLine();

        String[] ki = {"R","U","D"};
        String[] gu = {"L","U","D"};

        boolean g = false;
        for(int i=0;i<dance.length();i++){
            String step = String.valueOf(dance.charAt(i));
            if(!Arrays.asList(g?gu:ki).contains(step)){
                System.out.println("No");
                return;
            }
            g=!g;
        }
        System.out.println("Yes");
    }
}
