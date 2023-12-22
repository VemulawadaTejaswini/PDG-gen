import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String name = "ABD";
        if(num < 1000){
            name = "ABC";
        }
        System.out.println(name);
    }
}
