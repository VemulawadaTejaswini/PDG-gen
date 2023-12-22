
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String str1 = stdIn.nextLine();

        String str2 = "7";
        int result = str1.indexOf(str2);

        if(result == -1)
            System.out.print("No");
        else
            System.out.print("Yes");
    }

}