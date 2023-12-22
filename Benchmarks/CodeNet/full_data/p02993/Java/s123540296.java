import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str =  new StringBuilder(s);
        for(int i = 1; i < str.length(); ++i){
            if(str.charAt(i) == str.charAt(i-1)) {
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");

    }

}