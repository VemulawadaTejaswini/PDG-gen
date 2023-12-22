import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Byte[] daikeihen = new Byte[3];
        daikeihen[0] = sc.nextByte();
        daikeihen[1] = sc.nextByte();
        daikeihen[2] = sc.nextByte();
        System.out.println((daikeihen[0] + daikeihen[1]) * daikeihen[2] / 2);
    }