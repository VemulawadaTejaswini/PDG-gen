import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int value = s.nextInt();
        int coin = s.nextInt();

        int rest = value % 500;

        String result = "Yes";
       
        if (coin < rest) {
          result = "No";
        }
        System.out.println(result);
    }
}