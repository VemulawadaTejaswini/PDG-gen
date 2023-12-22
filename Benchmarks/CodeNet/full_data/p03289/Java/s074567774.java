import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int M;
    static int A;
    static long B;
    static long C;
//    static int[][] map;
    static int min = 9999999;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int cnt = 0;
        int ok = 1;
        for (int i = 0; i < s.length(); i++) {
            if(i == 0){
                if(s.charAt(0) != 'A')ok = 0;
            }else if(i == 1){
                if(s.charAt(1) == 'C')ok = 0;
                if(s.charAt(1) == 'A')ok = 0;
                String temp  = String.valueOf(s.charAt(i));

                if(temp.equals(temp.toUpperCase()))ok = 0;

            }else{
                String temp  = String.valueOf(s.charAt(i));



                if(s.charAt(i) == 'C'){
                    if(cnt == 1)ok = 0;
                    cnt = 1;
                }else{
                    if(temp.equals(temp.toUpperCase()))ok = 0;
                }
            }
        }

        if(s.charAt(s.length() - 1) == 'C')ok = 0;
        if(cnt == 0)ok = 0;

        if(ok == 1){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
    }




}

