import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        byte a = scan.nextByte();
        byte b = scan.nextByte();
        System.out.println((a + b) % 24);
    }
}