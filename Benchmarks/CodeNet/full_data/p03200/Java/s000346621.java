import java.util.Scanner;

public class Scratch {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String S = scan.next();
        long count = 0;
        long x = 0;
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'W'){
                count+=x;
            }else{
                x++;
            }
        }
        System.out.println(count);
    }
}