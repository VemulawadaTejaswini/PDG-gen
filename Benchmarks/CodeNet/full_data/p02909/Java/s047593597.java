import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        String S;

        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
        }
        String result = "";
        
        if("Sunny".equals(S)){
            result = "Cloudy";
        }else if("Cloudy".equals(S)){
            result = "Rainy";
        }else{
            result = "Sunny";
        }


        System.out.println(result);
    }


}
