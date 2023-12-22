import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coffee coffee = new Coffee();
        coffee.solve(sc);
    }

    static class Coffee {
        public void solve(Scanner sc) {
            String str = sc.next();
            if (str.charAt(2) == str.charAt(3) && str.charAt(4) == str.charAt(5)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
