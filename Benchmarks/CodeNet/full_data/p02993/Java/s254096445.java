import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String str = stdIn.nextLine();
        String[] strArray = str.split("");
        if (strArray[0].equals(strArray[1]))
            System.out.println("Bad");
        else if (strArray[1].equals(strArray[2]))
            System.out.println("Bad");
        else if (strArray[2].equals(strArray[3]))
            System.out.println("Bad");
        else
            System.out.println("Good");
    }
}
