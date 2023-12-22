import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String temp = scan.nextLine();
        String s = scan.nextLine();
        if(a >= 3200){
            System.out.println(s);
        }
        else{
            System.out.println("red");
        }

    }
}
