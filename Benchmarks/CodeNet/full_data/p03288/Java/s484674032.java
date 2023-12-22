import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();

        String result ;
        if(R < 1200 ){
            result = "ABC";
        }else if(R < 2800 ){
            result = "ARC";
        }else {
            result = "AGC";
        }
        System.out.println(result);
    }
}
