import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(execute(sc.nextLine()));

    }

    public static int execute(String text) {
        int result = 0;
        for(int front = 0; front < text.length() / 2; front++){
            int back = text.length() - front - 1;
            String frontChar = String.valueOf(text.charAt(front));
            String backChar = String.valueOf(text.charAt(back));


            if(!frontChar.equals(backChar)){
                result++;
            }
        }
        return  result;
    }

}