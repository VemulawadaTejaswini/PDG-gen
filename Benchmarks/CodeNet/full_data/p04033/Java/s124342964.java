import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long negaNum = 0 - a;

        if(a <= 0 && 0 <= b){
            out.println("Zero");
        } else if(negaNum % 2 == 1){
            out.println("Negative");
        } else {
            out.println("Positive");
        }
    }
}