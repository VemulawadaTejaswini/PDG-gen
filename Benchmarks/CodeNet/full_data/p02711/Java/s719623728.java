import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.next();
        if(text.contains("7")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
