import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        flaot total_len = Flaot.valueOf(sc.next());
        System.out.println((total_len/3)*(total_len/3)*(total_len/3));
    }
}