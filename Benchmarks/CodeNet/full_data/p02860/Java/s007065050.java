import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();
        if(n % 2 != 0){
            System.out.println("No");
        }else{
            int half = n/2;
            if(Objects.equals(str.substring(0, half),str.substring(half))){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}