import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        for (int i = 0; i < 100000; i++){
            str = str.replaceAll("ST", "");
        }

        /*while (str.matches(".*ST.*")){
            str = str.replaceAll("ST", "");
        }*/
        System.out.println(str.length());
    }
}