import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total_len = Double.valueOf(sc.next());
        System.out.println((total_len/3.0)*(total_len/3.0)*(total_len/3.0));
    }
}