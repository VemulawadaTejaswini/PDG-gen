import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        double d = Math.sqrt(Integer.parseInt(scn.read() + scn.read()));
        System.out.println((int)d == d ? "Yes" : "No");
    }
}