import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int start = -1;
        int end = -1;
        for(int i = 0; i < input.length(); i++){
            if( i + 1 < input.length()){
                if(input.charAt(i) == input.charAt(i+1)){
                    System.out.println((i + 1) + " " + (i + 2));
                    return;
                }
            }else if(i + 2 < input.length()){
                if(input.charAt(i) == input.charAt(i + 2)){
                    System.out.println((i + 1) + " " + (i + 3));
                    return;
                }
            }
        }
        System.out.println("-1 -1");

    }
}
