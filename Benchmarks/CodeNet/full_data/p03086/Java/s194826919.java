import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max_count = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'T' || s.charAt(i) == 'C' || s.charAt(i) == 'G'){
                count += 1;
                if(count > max_count){
                    max_count = count;
                }
            }else{
                count = 0;
            }
        }
        System.out.println(max_count);
    }
}