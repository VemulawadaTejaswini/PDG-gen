import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        String s = in.nextLine();

        if(a < 3200){
            System.out.println("red");
        } else{
            System.out.println(s);
        }
    }
}