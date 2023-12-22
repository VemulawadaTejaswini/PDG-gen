import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = "";
        for(int i=0; i<3; i++) {
            s += sc.next();
        }
        System.out.println("" + s.charAt(0) + s.charAt(4) + s.charAt(8));
    }

}
